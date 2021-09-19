package hjemmeOppgave;

import java.time.LocalDateTime;

public class Eksemplar {
    Gradering gradering;
    double pris;
    LocalDateTime mottattDato;
    Long utgivelsesid;

    public Eksemplar(Long utgivelsesid, Gradering gradering, double pris, LocalDateTime mottattDato) {
        this.utgivelsesid = utgivelsesid;
        this.gradering = gradering;
        this.pris = pris;
        this.mottattDato = mottattDato;
    }

    public Long getUtgivelsesId() { return utgivelsesid; }
    public Gradering getGradering() { return gradering; }
    public double getPris() { return pris; }
    public LocalDateTime getMottattDato() { return mottattDato; }

	public void setPris(double pris) { this.pris = pris; }
	public void setGradering(Gradering gradering) { this.gradering = gradering;}
}
