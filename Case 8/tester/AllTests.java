package tester;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, TestPersonFodelsnummer.class, TestPersonGetFormue.class, TestPersonGetId.class,
		TestPersonGetLevende.class, TestPersonGetNavn.class, TestPersonRegistrerForeldre.class,
		TestRegisterGetPerson.class, TestRegisterLagrePerson.class, TestRegisterRegistrerForeldre.class })

public class AllTests {

}
