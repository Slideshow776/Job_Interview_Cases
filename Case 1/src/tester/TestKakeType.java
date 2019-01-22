package tester;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hjemmeOppgave.KakeType;

class TestKakeType {

	private static KakeType kakeType1;
	private static KakeType kakeType2;
	private static KakeType kakeType3;

	@BeforeAll
	public static void init() {
        kakeType1 = KakeType.SJOKOLADEKAKE;
        kakeType2 = KakeType.KRANSEKAKE;
        kakeType3 = KakeType.BLOTKAKE;
	}

	@Test
	void testToString() {
		assertEquals("Sjokoladekake", kakeType1.toString());
		assertEquals("Kransekake", kakeType2.toString());
		assertEquals("Bløtkake", kakeType3.toString());
	}

}
