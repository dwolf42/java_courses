package dwolf.project_battleship.model;


public enum Cell {
    HIT("X"),
    MISS("M"),
    WATER("~"),
    SHIP("O");

    private final String symbol;

    Cell(String symbol) {
        this.symbol = symbol;
    }

    private String getSymbol() {
        return symbol;
    }

    public static Cell fromSymbol(String c) {
        for (Cell state : values()) {
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
