package tester;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hjemmeOppgave.Gradering;

class TestGradering {

	private static Gradering gradering0;
	private static Gradering gradering1;
	private static Gradering gradering2;
	private static Gradering gradering3;

	@BeforeAll
	public static void init() {
        gradering0 = Gradering.TIL_VURDERING;
        gradering1 = Gradering.SLITT;
        gradering2 = Gradering.PENT_BRUKT;
        gradering3 = Gradering.SOM_NY;
	}

	@Test
	void testToString() {
		assertEquals("Eksemplaret er til vurdering.", gradering0.toString());
		assertEquals("Eksemplaret er slitt.", gradering1.toString());
		assertEquals("Eksemplaret er pent brukt.", gradering2.toString());
		assertEquals("Eksemplaret er som ny.", gradering3.toString());
	}

}
