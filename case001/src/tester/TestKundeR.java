package tester;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import hjemmeOppgave.Kunde;

class TestKundeR {

	private static Kunde kunde;
	private static AtomicLong id;
	private static Long kundeId;

	@BeforeAll
	public static void init() {
		id = new AtomicLong();
		kundeId = id.incrementAndGet();
		kunde = new Kunde("Sandra", kundeId);
	}

	@Test
	void testGetId() {
		assertEquals(kundeId, kunde.getId());
	}

	@Test
	void testGetNavn() {
		assertEquals("Sandra", kunde.getNavn());
	}

}
