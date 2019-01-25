package tester;

import static org.junit.Assert.*;

import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPersonGetFormue {

	@Test
	public void test() {
		Person test = new Person("Sandra", 150, "031185");
		
		int output = test.getFormue();
		assertEquals(150, output);
	}

}
