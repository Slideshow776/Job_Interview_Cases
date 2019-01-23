package hjemmeOppgave;

import java.time.LocalDateTime;

public class Utgivelse {
    private double pris;
    private String sjanger;
    private LocalDateTime utgivelseDato;

    public Utgivelse(double pris, String sjanger, LocalDateTime utgivelseDato) {
        this.pris = pris;
        this.sjanger = sjanger;
        this.utgivelseDato = utgivelseDato;
    }

    public double getPris() { return pris; }
    public String getSjanger() { return sjanger; }
    public LocalDateTime getUtgivelseDato() { return utgivelseDato; }
}
