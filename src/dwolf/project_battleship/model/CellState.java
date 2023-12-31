package dwolf.project_battleship.model;

enum CellState {
    HIT('X'),
    MISS('M'),
    OCEAN('~'),
    SHIP('O');

    private final Character value;

    CellState(Character value) {
        this.value = value;
    }

    Character getValue() {
        return value;
    }

    static CellState fromCharacter(Character c) {
        for (CellState state : values()) {
            if (state.getValue() == c) {
                return state;
            }
        }
        return null;
    }
}
