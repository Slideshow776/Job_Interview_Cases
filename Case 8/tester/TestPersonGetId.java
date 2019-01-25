package tester;

import static org.junit.Assert.*;

import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPersonGetId {

	@Test
	public void test() { 
		Person test1 = new Person("Sandra", 150, "031185");
		Person test2 = new Person("Jens", 10, "031183");
		
		int output1 = test1.getId();
		int output2 = test2.getId();
		
		// Onsker at id skal vaere forskjellig
		assertTrue(output1 == output2);
	}

}
