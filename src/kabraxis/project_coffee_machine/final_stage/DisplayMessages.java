package kabraxis.project_coffee_machine.final_stage;

public class DisplayMessages {
    public final String ERROR_SELECT_INPUT = "Error! Invalid input.";
    public final String ERROR_FILL_INPUT = "You may only add amounts of 0 and above";
    public final String EXIT_MESSAGE = "Turning off...";
    public final String SELECT_MESSAGE = "Write action (buy, fill, take, remaining, exit):";
    public final String BUY_MESSAGE = "What do you want to buy? " +
            "1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:";
    public final String MISSING_ITEM = "Sorry, not enough ";
    public final String TAKE_MESSAGE = "\nI gave you $";
    public final String SET_WATER = "Input how many ml of water you want to add: ";
    public final String SET_MILK = "Input how many ml of milk you want to add: ";
    public final String SET_BEANS = "Input how many grams of coffee beans you want to add: ";
    public final String SET_CUPS = "Input how many disposable cups of coffee you want to add: ";
    public final String CONFIRM_ORDER = "I have enough resources, making you a coffee!";

    public DisplayMessages() {

    }
    public static DisplayMessages getMessagesObject() {
        return messages;
    }
}
