package dwolf.laboratory.enums;

// Enum is a special class in Java that represents a group of constants.
// Here we have the enum Action, with its constants.
enum Action {

    // These are the constants of the 'Action'.
    // Each of it has an int 'value' associated written in parentheses.
    // In a more visual and metaphoric manner, the values inside the parentheses can be seen like a backpack,
    // that the constants carry with them when created. When the constants are initialized or "constructed",
    // they "drop" the contents of their backpacks. The constructor "catches" them to assign the values to the
    // corresponding constants.
    ATTACK(1),
    DEFEND(2),
    CAST_SPELL(3);

    // This variable belongs to each 'Action' constant (ATTACK, DEFEND, CAST_SPELL).
    // Each of these constants has its own 'value' (ints in parentheses), which will be set, when the constant is created.
    private final int value;

    // This is the constructor for the 'Action' enum. It's called when an 'Action' constant is created.
    // Its job is to set the 'value' of the created constant.
    Action(int value) {
        this.value = value;
    }

    // This is a getter method, to get the 'value' of an 'Action' constant from outside the enum.
    // It is needed because the int 'value' is 'private'
    int getValue() {
        return value;
    }

    // This is a method that takes an int as input and returns the 'Action' constant associated with that integer.
    // It does this by iterating over all 'Action' constants (using 'values()', which returns an array of all constants)
    // and checking if their 'value' is equal to 'i'. If it finds a match, it returns that constant, or 'null' if not.
    // The method must be 'static', as it operates on a class level, independent of individual instances.
    // We can access the non-static methods 'values()' and 'getValue()' since 'values()' provides an instance
    // of 'Action'. This is due to the fact that 'values()' is short for 'Action.values()'.
    // This short version can only be used inside an enum class!
    static Action fromInt(int i) {
        for (Action action : values()) {
            if (action.getValue() == i) {
                return action;
            }
        }
        return null;
    }
}
