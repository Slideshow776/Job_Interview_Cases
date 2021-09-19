package hjemmeOppgave;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

    private Long id;
    private String navn;
    private List<Kake> kakerBestillt;
    private List<Kake> kakerLevert;

    public Kunde(String navn, Long id) {
        this.navn = navn;
        this.id = id;

        this.kakerBestillt = new ArrayList<>();
        this.kakerLevert = new ArrayList<>();
    }

    public Long getId() { return id; }
    public String getNavn() { return navn; }
    public List<Kake> getKakerBestillt() { return kakerBestillt; }
    public List<Kake> getKakerLevert() { return kakerLevert; }
}
