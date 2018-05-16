package hjemmeOppgave;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class Registrering {

	AtomicLong id;
	HashMap<Long, Kunde> kunder;
	HashMap<Long, Kake> bestillinger;
	HashMap<Long, Kake> leverteBestillinger;
	
	public Registrering() {
		id = new AtomicLong();
		kunder = new HashMap<Long, Kunde>();
		bestillinger = new HashMap<Long, Kake>();
		leverteBestillinger = new HashMap<Long, Kake>();
	}
	
	public void registrerNyKunde(String navn) {
		Kunde kunde = new Kunde(navn);
		Long kundeId = id.incrementAndGet();
		kunde.setId(kundeId);
		kunder.put(kundeId, kunde);
	}
	
	public void reqistrerBestilling(Long kundeId, String typeKake, int time, int minutt, int sekund) {
		Kake kake = new Kake(typeKake, time, minutt, sekund);
		bestillinger.put(kundeId, kake);
	}
	
	// TODO: denne metoden er mye uferdig ...
	public void registrerLevertBestilling(Long kundeId, String typeKake, int time, int minutt, int sekund) {
		bestillinger.remove(kundeId);
		
		/*
		leverteBestillinger.put(kundeId, )
		Date senesteBestilling;
		for (Long key: bestillinger.keySet()) {
			
			// if kunde har bestillt mer enn en av samme type 
			senesteBestilling = bestillinger.get(kundeId).getBestilltTidspunkt();
			// TODO: få tak i seneste bestilling ...
		}
		*/
		
	}
	
	public Kunde getKunde(Long id) { return kunder.get(id); }
	public Kake getBestilling(Long id) { return bestillinger.get(id); }
}
