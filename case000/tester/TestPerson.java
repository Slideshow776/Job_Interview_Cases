package tester;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Before;
import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPerson {

	private Person person, foreldre1;
	private AtomicLong id;
	long personId, foreldreId;

	@Before
	public void init() {
		// Barn
		Calendar personF�dselsdato = Calendar.getInstance();
		id = new AtomicLong();
		personId = id.incrementAndGet();
		personF�dselsdato.set(1985, 10, 03);
		person = new Person(
				"Sandra Moen",
				125000,
				personF�dselsdato.getTime(),
				personId
				);
		
		// Foreldre
		Calendar forelderF�dselsdato = Calendar.getInstance();
		forelderF�dselsdato.set(1963, 8, 14);
		foreldreId = id.incrementAndGet();
		foreldre1 = new Person(
				"Tone Bergo Moen",
				250000, 
				forelderF�dselsdato.getTime(),
				foreldreId
				);		
				
		person.setForeldre(foreldre1);
		foreldre1.setBarn(person);
	}

	
	@Test
	public void testGetBarn() {
		assertEquals(person, foreldre1.getBarn().get(0));
	}
	
	@Test
	public void testGetID() {
		assertEquals(Long.valueOf(personId), person.getId());
	}

	@Test
	public void testGetNavn() {
		assertEquals("Sandra Moen", person.getNavn());
	}

	@Test
	public void testGetF�dselsdato() {
		Calendar testF�dselsdato = Calendar.getInstance();
		testF�dselsdato.set(1985, 10, 03);
		
		assertEquals(testF�dselsdato.getTime(), person.getF�dselsdato());
	}

	@Test
	public void testGetFormue() {
		assertEquals(125000, person.getFormue());
	}

	@Test
	public void testGetLevende() {
		assertEquals(true, person.getLevende());
	}

	@Test
	public void testGetForeldre() {
		assertEquals(foreldre1, person.getForeldre().get(0));
	}
		
	@Test
	public void testSetLevende() {
		person.setLevende(false);
		assertEquals(false, person.getLevende());
	}
	
	@Test
	public void setFormue() {
		person.setFormue(50000);
		assertEquals(50000, person.getFormue());
	}
}
