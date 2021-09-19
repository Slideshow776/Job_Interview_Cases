package tester;

import static org.junit.Assert.*;

import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPersonGetLevende {

	@Test
	public void test() {
		Person test = new Person("Sandra", 150, "031185");
		
		boolean output = test.getLevende();
		assertEquals(true, output);
	}

}
