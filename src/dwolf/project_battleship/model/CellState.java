package dwolf.project_battleship.model;

public enum CellState {
    HIT("X"),
    MISS("M"),
    OCEAN("~"),
    SHIP("O");

    private final String symbol;

    CellState(String symbol) {
        this.symbol = symbol;
    }

    private String getSymbol() {
        return symbol;
    }

    public static CellState fromSymbol(String c) {
        for (CellState state : values()) {
            if (state.getSymbol().equals(c)) {
                return state;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
