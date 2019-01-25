package tester;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import hjemmeOppgave.Person;

public class TestPersonRegistrerForeldre {

	@Test
	public void test() { // denne testen tester ogsaa Person.getForeldre()
		Person test1 = new Person("Sandra", 150, "031185");
		Person test2 = new Person("Tone", 200, "031182");
		test1.registrerForeldre(test2);
		
		// tester om vi kan legge til foreldre.
		ArrayList<Person> output1 = test1.getForeldre();
		assertEquals(1, output1.size());
		
		// tester om vi kan legge til yngre foreldre
		Person test3 = new Person("Jens", 200, "031186");
		test1.registrerForeldre(test3); // denne skal feile
		
		ArrayList<Person> output2 = test1.getForeldre();
		assertEquals(1, output2.size());
		
		//tester om vi kan ha flere enn 2 foreldre.
		Person test4 = new Person("Marie", 200, "031182");
		test1.registrerForeldre(test4);
		Person test5 = new Person("Kjell", 200, "031182");
		test1.registrerForeldre(test5); // denne skal feile
		
		ArrayList<Person> output3 = test1.getForeldre();
		assertEquals(2, output3.size());		
	}
}