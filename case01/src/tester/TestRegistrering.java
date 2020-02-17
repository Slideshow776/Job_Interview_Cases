package tester;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hjemmeOppgave.Kake;
import hjemmeOppgave.KakeType;
import hjemmeOppgave.Kunde;
import hjemmeOppgave.Registrering;

class TestRegistrering {

	private static Long kundeId;
	private static Registrering registrering;
    private static Map<Long, Kunde> kunder;
    private static Map<Long, Kake> bestillinger;
    private static Map<Long, Kake> leveranser;
    
    private static Long idSandra;

	@BeforeAll
	public static void init() {
        registrering = new Registrering();
        kunder = new HashMap<>();
        bestillinger = new HashMap<>();
        leveranser = new HashMap<>();
        
        /////////////////////////////////////////

        idSandra = registrering.registrerNyKunde("Sandra");
        registrering.bestillKake(registrering.getKunder().get(idSandra), KakeType.SJOKOLADEKAKE, LocalDateTime.of(2019, 1, 22, 12, 00));
        registrering.bestillKake(registrering.getKunder().get(idSandra), KakeType.SJOKOLADEKAKE, LocalDateTime.of(2019, 1, 22, 9, 00));
        registrering.bestillKake(registrering.getKunder().get(idSandra), KakeType.BLOTKAKE, LocalDateTime.of(2019, 1, 22, 13, 30));
	}

	@Test
	void testRegistrerNyKunde() {
		assertEquals(1, registrering.getKunder().size());
		assertEquals("Sandra", registrering.getKunder().get(idSandra).getNavn());
	}

	@Test
	void testBestillKake() {
		assertEquals(3, registrering.getBestillinger().size());
		assertEquals("Sandra", registrering.getBestillinger().get(0).getKunde().getNavn());
		assertEquals(KakeType.SJOKOLADEKAKE, registrering.getBestillinger().get(0).getKakeType());
	}

	@Test
	void testLeverKake() {
		assertEquals(true, registrering.leverKake(idSandra, KakeType.SJOKOLADEKAKE, LocalDateTime.of(2019, 1, 22, 17, 05)));
		assertEquals(2, registrering.getBestillinger().size());
		assertEquals(LocalDateTime.of(2019, 1, 22, 12, 00), registrering.getBestillinger().get(0).getTidBestillt());
		registrering.leverKake(idSandra, KakeType.BLOTKAKE, LocalDateTime.of(2019, 1, 22, 18, 00));
		assertEquals(1, registrering.getBestillinger().size());
	}
}
