package hjemmeOppgave;

public enum Gradering {
    TIL_VURDERING("til vurdering"), SLITT("slitt"), PENT_BRUKT("pent brukt"), SOM_NY("som ny");

    private String gradering;

    Gradering(String gradering) {
        this.gradering = gradering;
    }

    @Override
    public String toString() {
        return "Eksemplaret er " + gradering + ".";
    }
}
