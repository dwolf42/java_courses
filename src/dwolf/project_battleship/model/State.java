package dwolf.project_battleship.model;

public enum State {
    HIT('X'),
    MISS('M'),
    OCEAN('~'),
    SHIP('O');

    private final Character value;

    State(Character value) {
        this.value = value;
    }

    Character getValue() {
        return value;
    }

    static State fromCharacter(Character c) {
        for (State state : values()) {
            if (state.getValue() == c) {
                return state;
            }
        }
        return null;
    }
}
