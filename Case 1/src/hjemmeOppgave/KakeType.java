package hjemmeOppgave;

public enum KakeType {
    KRANSEKAKE("Kransekake"), SJOKOLADEKAKE("Sjokoladekake"), BLOTKAKE("Bløtkake");

    private String navn;

    KakeType(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
