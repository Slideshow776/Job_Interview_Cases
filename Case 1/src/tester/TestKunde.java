/*
 * Skrevet av Sandra Moen 8 februar 2018
 * 
 * 
 */

package tester;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.atomic.AtomicLong;

import org.junit.Before;
import org.junit.Test;

import hjemmeOppgave.Kunde;

public class TestKunde {
	
	Kunde kunde;
	AtomicLong id;
	Long kundeId;

	@Before
	public void init() {
		kunde = new Kunde("Sandra");
		AtomicLong id = new AtomicLong();
		kundeId = id.incrementAndGet();
		kunde.setId(kundeId);
	}

	@Test
	public void testGetId() {
		assertEquals(kundeId, kunde.getId());
	}
	
	@Test
	public void testGetNavn() {
		assertEquals("Sandra", kunde.getNavn());
	}

}
