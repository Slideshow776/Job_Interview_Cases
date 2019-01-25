package tester;

import static org.junit.Assert.*;

import org.junit.Test;

import hjemmeOppgave.Person;
import hjemmeOppgave.PersonRegister;

public class TestRegisterGetPerson {

	@Test
	public void test() {
		PersonRegister test = new PersonRegister();		

		int idTilSandra = test.lagrePerson("Sandra", 150, "031185");
		
		Person output = test.getPerson(1); // med bare en person registrert blir id = 1
		assertEquals(idTilSandra, output.getId());
	}

}
