package tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPersonGetNavn {

	@Test
	public void test() {
		Person test = new Person("Sandra", 150, "031185");
		
		String output = test.getNavn();
		assertEquals("Sandra", output);
	}
}
