package tester;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hjemmeOppgave.Kake;
import hjemmeOppgave.Kunde;
import hjemmeOppgave.Registrering;

public class TestRegister {

	Registrering register;
	Kake kake;
	Kunde kunde;
	Long kundeId;
	
	@Before
	public void init() {
		register = new Registrering();
		kunde = new Kunde("Sandra");
		kundeId = (long) 1;
		kunde.setId(kundeId);
		
		kake = new Kake("sjokoladekake", 12, 30, 00);
	}
	 
	@Test
	public void testRegistrerNyKunde() {
		register.registrerNyKunde("Sandra");
		assertEquals(kunde.getNavn(), register.getKunde(kundeId).getNavn());
	}
	
	@Test
	public void testReqistrerBestilling() {
		register.reqistrerBestilling(kundeId, "sjokoladekake", 12, 30, 00);
		
		assertEquals(kake.getType(), register.getBestilling(kundeId).getType());
	}

}
