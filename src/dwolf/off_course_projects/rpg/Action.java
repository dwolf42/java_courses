package dwolf.off_course_projects.rpg;

enum Action {
    ATTACK(1),
    DEFEND(2),
    CAST_SPELL(3);

    private final int number;

    Action(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    static Action fromInt(int i) {
        for (Action action : Action.values()) {
            if (action.getNumber() == i) {
                return action;
            }
        }
        return null;
    }
}
