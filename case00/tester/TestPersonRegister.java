package tester;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import hjemmeOppgave.PersonRegister;

public class TestPersonRegister {

	private PersonRegister personRegister;

	@Before
	public void init() {
		personRegister = new PersonRegister();
	}

	@Test
	public void testGetRegister() {
		personRegister.leggTilPerson("Sandra Moen", 125000, "03.11.1985");
		assertEquals(1, personRegister.getRegister().size());
	}

	@Test
	public void testLeggTilOgHentPerson() {		
		Long id = personRegister.leggTilPerson("Sandra Moen", 125000, "03.11.1985");		
		assertEquals(
				personRegister.getRegister().get(id),
				personRegister.hentPerson(id)
				);
	}

	@SuppressWarnings("unused")
	@Test
	public void testLeggTilForeldrerelasjon() {
		Long sandra = personRegister.leggTilPerson("Sandra Moen", 125000, "03.11.1985");
		Long tone = personRegister.leggTilPerson("Tone Bergo Moen", 465000, "14.09.1963");
		Long janOve = personRegister.leggTilPerson("Jan Ove Moen", 685000, "15.10.1960");

		// teste å kunne legge til foreldre og hente dem tilbake.
		personRegister.leggTilForeldrerelasjon(tone, sandra);
		personRegister.leggTilForeldrerelasjon(janOve, sandra);
		assertEquals(
				personRegister.hentPerson(tone),
				personRegister.hentPerson(sandra).getForeldre().get(0)
				);

		// teste å ikke legge til foreldrerelasjon når barnet er eldre enn foreldre.
		Long ola1 = personRegister.leggTilPerson("Ola Nordmann", 1337, "14.09.1999");
		assertEquals(2, personRegister.hentPerson(sandra).getForeldre().size());

		// teste å ikke legge til enda en foreldrerelasjon når barnet alerede har to foreldre.
		Long ola2 = personRegister.leggTilPerson("Ola Nordmann", 1337, "14.09.1950");
		assertEquals(2, personRegister.hentPerson(sandra).getForeldre().size());
	}

	@Test
	public void testPrintUtPersonregisteretAlfabetisk() {		
		try {
			personRegister.printPersonregisteretAlfabetisk();
			fail("Expected an EmptyStackException to be thrown");
		} catch (EmptyStackException anEmptyStackException) {
			assertEquals(anEmptyStackException.getMessage(), null);
		}

		personRegister.leggTilPerson("Sandra Moen", 125000, "03.11.1985");
		personRegister.leggTilPerson("Tone Bergo Moen", 465000, "14.09.1963");
		personRegister.leggTilPerson("Jan Ove Moen", 685000, "15.10.1960");
		personRegister.leggTilPerson("Øystein Sjøtveit", 225000, "31.9.1984");

		ArrayList<String> liste = personRegister.printPersonregisteretAlfabetisk();
		assertEquals("Jan Ove Moen", liste.get(0));
	}

	@Test
	public void testRegistrerDød() {
		Long sandra = personRegister.leggTilPerson("Sandra Moen", 125000, "03.11.1985");
		Long alexander = personRegister.leggTilPerson("Alexander Moen", 75000, "1.7.1989");
		Long veslemøy = personRegister.leggTilPerson("Veslemøy Moen", 32000, "14.10.1994");
		Long janOve = personRegister.leggTilPerson("Jan Ove Moen", 1000000, "15.10.1960");
		Long tone = personRegister.leggTilPerson("Tone Bergo Moen", 285000, "14.09.1963");

		personRegister.leggTilForeldrerelasjon(janOve, sandra);
		personRegister.leggTilForeldrerelasjon(janOve, alexander);
		personRegister.leggTilForeldrerelasjon(janOve, veslemøy);
		personRegister.leggTilForeldrerelasjon(tone, sandra);
		personRegister.leggTilForeldrerelasjon(tone, alexander);
		personRegister.leggTilForeldrerelasjon(tone, veslemøy);

		// test med formue > 100k
		personRegister.registrerDød(janOve);
		assertEquals(false, personRegister.hentPerson(janOve).getLevende());
		assertEquals(0, personRegister.hentPerson(janOve).getFormue());
		assertEquals(
				(int)((1000000/3)*.75) + 125000,
				personRegister.hentPerson(sandra).getFormue()
				);
		assertEquals(
				(int)((1000000/3)*.75) + 75000,
				personRegister.hentPerson(alexander).getFormue()
				);
		assertEquals(
				(int)((1000000/3)*.75) + 32000,
				personRegister.hentPerson(veslemøy).getFormue()
				);

		// test med formue < 100k
		personRegister.registrerDød(tone);
		assertEquals(
				(int)(285000/3) + 125000 + 250000, // mors arv + orginal formue + fars arv
				personRegister.hentPerson(sandra).getFormue() + 1 // avrundings-offset
				);
		assertEquals(
				(int)(285000/3) + 75000 + 250000, // mors arv + orginal formue + fars arv
				personRegister.hentPerson(alexander).getFormue() + 1 // avrundings-offset
				);
		assertEquals(
				(int)(285000/3) + 32000 + 250000, // mors arv + orginal formue + fars arv
				personRegister.hentPerson(veslemøy).getFormue() + 1 // avrundings-offset
				);
	}
}
