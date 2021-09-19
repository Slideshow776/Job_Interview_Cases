package tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hjemmeOppgave.PersonRegister;

public class TestRegisterLagrePerson {

	@Test
	public void test() {
		PersonRegister test = new PersonRegister();
		
		int output = test.lagrePerson("Sandra", 150, "031185");
		assertEquals(1, output);
	}

}
