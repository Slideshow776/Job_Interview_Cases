package hjemmeOppgave;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class Registrering {    
    
    private AtomicLong utgivelsesId;
    private AtomicLong eksemplarId;

    private Map<Long, Utgivelse> utgivelser;
    private Map<Long, Eksemplar> eksemplarer;
    private Map<Long, Eksemplar> solgteEksemplarer;

    public Registrering() {
        utgivelsesId = new AtomicLong();
        utgivelser = new HashMap<>();

        eksemplarId = new AtomicLong();
        eksemplarer = new HashMap<>();
    }

    public Long registrerUtgivelse(double utsalgspris, String sjanger, LocalDateTime utgivelsesdato) {
        Long id = utgivelsesId.incrementAndGet();
        utgivelser.put(id, new Utgivelse(utsalgspris, sjanger, utgivelsesdato));
        return id;
    }

    public Long registrerEksemplar(Long utgivelsesId, Gradering gradering, double pris, LocalDateTime mottattDato) {
        if (gradering == Gradering.TIL_VURDERING) {
            pris = 0d;
        }
        Long id = eksemplarId.incrementAndGet();
        eksemplarer.put(id, new Eksemplar(utgivelsesId, gradering, pris, mottattDato));
        return id;
    }

    public void oppdaterEksemplar(Long id, double pris, Gradering gradering) {
        Eksemplar eksemplar = eksemplarer.get(id);
        eksemplar.setPris(pris);
        eksemplar.setGradering(gradering);
    }

    public String selgEksemplar(Long id, double pris, LocalDateTime dato) {
        Eksemplar eksemplar = eksemplarer.get(id);
        if (eksemplar.getGradering() == Gradering.TIL_VURDERING || eksemplar.getPris() == 0) {
            return "Feil: Kan ikke selge dette eksemplaret. Gradering er: "
                + eksemplar.gradering + ", pris er: " + eksemplar.pris;
        }

        solgteEksemplarer.put(id, eksemplar);
        eksemplarer.remove(id);
        return "";
    }

    public Map<Long, Eksemplar> getTilVurdering() {
        eksemplarerTilVurdering = new HashMap<>();
        for (Eksemplar eksemplar : eksemplarer.values()) {
            if (eksemplar.getGradering() == Gradering.TIL_VURDERING) {
                eksemplarerTilVurdering.put(
                    eksemplar.key(), // Tror ikke .key() fungerer, pseudokode
                    eksemplar
                );
            }
        }
        return eksemplarerTilVurdering;
    }

    public Map<Long, Utgivelse> getUtgivelser() { return utgivelser; }
    public Map<Long, Eksemplar> getEksemplarer() { return eksemplarer; }
}
