package hjemmeOppgave;

import java.time.LocalDateTime;

public class Kake {
    private Kunde kunde;
    private KakeType kaketype;
    private LocalDateTime tidBestillt;
    private LocalDateTime tidLevert;

    public Kake(Kunde kunde, KakeType kakeType, LocalDateTime tidBestillt) {
        this.kunde = kunde;
        this.kaketype = kakeType;
        this.tidBestillt = tidBestillt;
    }

    public Kunde getKunde() { return kunde; }
    public KakeType getKakeType() { return kaketype; }
    public LocalDateTime getTidBestillt() { return tidBestillt; }
    public LocalDateTime getTidLevert() { return tidLevert; }

    public void setTidLevert(LocalDateTime ldt) { tidLevert = ldt; }
}
