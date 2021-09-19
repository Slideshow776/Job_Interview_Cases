package tester;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hjemmeOppgave.Gradering;
import hjemmeOppgave.Registrering;
import hjemmeOppgave.Utgivelse;

class TestRegistrering {

    private static Registrering registrering;
    
    private static Long utgivelsesId;
    private static Map<Long, Utgivelse> utgivelser;

    private static Long eksemplarId;
    private static Map<Long, Utgivelse> eksemplarer;

	@BeforeAll
	public static void init() {
        registrering = new Registrering();
        utgivelser = new HashMap<>();
        eksemplarer = new HashMap<>();        

        utgivelsesId = registrering.registrerUtgivelse(
            32.50d,
            "Science Fiction",
            LocalDateTime.of(2019, 1, 5, 12, 30)
        );

        eksemplarId = registrering.registrerEksemplar(
            utgivelsesId,
            Gradering.SLITT,
            22.75d,
            LocalDateTime.of(2019, 1, 23, 9, 8)
        );
	}

	@Test
	void testRegistrerUtgivelse() {
		assertEquals(1, registrering.getUtgivelser().size());
		assertEquals("Science Fiction", registrering.getUtgivelser().get(utgivelsesId).getSjanger());
    }
    
    @Test
    void testRegistrerEksemplar() {
        assertEquals(1, registrering.getEksemplarer().size());
        assertEquals(22.75d, registrering.getEksemplarer().get(eksemplarId).getPris());
    }

    @Test
    void testOppdaterEksemplar() { // Feil: Denne oppdaterer for de andre testene også...
        registrering.oppdaterEksemplar(eksemplarId, 32.50d, Gradering.SOM_NY);
        assertEquals(32.50d, registrering.getEksemplarer().get(eksemplarId).getPris());
    }
}
