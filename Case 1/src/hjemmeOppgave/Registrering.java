package hjemmeOppgave;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Registrering {
    
    private AtomicLong id;
    private Map<Long, Kunde> kunder;
    private List<Kake> bestillinger;
    private List<Kake> leveranser;

    public Registrering() {
        id = new AtomicLong();
        kunder = new HashMap<>();
        bestillinger = new ArrayList<>();
        leveranser = new ArrayList<>();
    }

    public Long registrerNyKunde(String navn) {
        Long kundeId = id.incrementAndGet();
        kunder.put(kundeId, new Kunde(navn, kundeId));
        return kundeId;
    }

    public void bestillKake(Kunde kunde, KakeType kakeType, LocalDateTime tidspunkt) {
        Kake kake = new Kake(kunde, kakeType, tidspunkt);
        bestillinger.add(kake);
    }

    public boolean leverKake(Long kundeId, KakeType kakeType, LocalDateTime tidLevert) {
        System.out.println("test 0");
        List<Kake> kundeBestillinger = kunder.get(kundeId).getKakerBestillt();
        List<Kake> likeBestillinger = new ArrayList<>();

        for (Kake kake : kundeBestillinger) {
            if (kakeType == kake.getKakeType()) {
                likeBestillinger.add(kake);
            }
        }

        if (likeBestillinger.size() < 2) {
            for (Kake kake : kundeBestillinger) {
                if (kakeType == kake.getKakeType()) {
                    kake.setTidLevert(tidLevert);
                    bestillinger.remove(kake);
                    return true;
                }
            }
            return false; // Error...
        }

        System.out.println("test 1");
        LocalDateTime sistBestillt = LocalDateTime.now();
        for (Kake kake : likeBestillinger) {
            if (kake.getTidBestillt().isBefore(sistBestillt)) {
                sistBestillt = kake.getTidBestillt();
                System.out.println("test 2");
            }
        }
        
        for (Kake kake : kundeBestillinger) {
            if (kake.getTidBestillt() == sistBestillt) {
                System.out.println("test 3");
                kake.setTidLevert(tidLevert);
                bestillinger.remove(kake);
                return true;
            }
        }

        return false; // Error...
    }

    public Map<Long, Kunde> getKunder() { return kunder; }
    public List<Kake> getLeveranser() { return leveranser; }
    public List<Kake> getBestillinger() { return bestillinger; }
    public Kunde getKunde(Long kundeId) { return kunder.get(kundeId); }
}
