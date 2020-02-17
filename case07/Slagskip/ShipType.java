public enum ShipType {
    SLAGSKIP("Slagskip", 5),
    FREGATT("Fregatt", 4),
    KORVETTE("Korvette", 3);

    private final String text;
    private final int size;

    ShipType(final String text, final int size) {
        this.text = text;
        this.size = size;
    }

    public int getSize() { return size; }

    @Override
    public String toString() {
        return text;
    }
}
