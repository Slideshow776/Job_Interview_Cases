package tester;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Before;
import org.junit.Test;

import hjemmeOppgave.Kake;

public class TestKake {

	Kake kake;
	AtomicLong id;
	Long kundeId;
	
	@Before
	public void init() {
		kake = new Kake("sjokoladekake", 12, 30, 00);
		AtomicLong id = new AtomicLong();
		kundeId = id.incrementAndGet();
	}


	@Test
	public void testGetBestilltTidspunkt() {		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 12);
		calendar.set(Calendar.MINUTE, 30);
		calendar.set(Calendar.SECOND, 00);
		
		
		assertEquals(calendar.getTime(), kake.getBestilltTidspunkt());
	}
	
	@Test
	public void testType() {
		assertEquals("sjokoladekake", kake.getType());
	}

}
