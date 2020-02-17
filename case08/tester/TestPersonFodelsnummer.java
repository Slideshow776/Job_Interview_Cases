package tester;

import static org.junit.Assert.*;

import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPersonFodelsnummer {

	@Test
	public void test() {
		Person test = new Person("Sandra", 150, "031185");
		
		String output = test.getFodselsnummer();
		assertEquals("031185", output);
	}

}
