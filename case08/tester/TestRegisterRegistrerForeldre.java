package tester;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import hjemmeOppgave.Person;
import hjemmeOppgave.PersonRegister;

public class TestRegisterRegistrerForeldre {

	@Test
	public void test() {
		PersonRegister test = new PersonRegister();		

		int idTilBarn = test.lagrePerson("Sandra", 150, "031185");
		int idTilForeldre = test.lagrePerson("Tone", 200, "031182");
		
		test.registrerForeldre(idTilBarn, idTilForeldre);
		
		ArrayList<Person> output1 = test.getPerson(idTilBarn).getForeldre();
		assertEquals(1, output1.size());	
	}
}
