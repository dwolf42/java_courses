package dwolf.project_coffee_machine.redundant_final_stage;

// Eventually make constant enum
public class redundant_DisplayMessages {

    public final String ERROR_MESSAGE = "\nError! Invalid input.";
    public final String SELECT_MESSAGE = "Please enter an action \"buy, fill, take, remaining, exit\": ";
    public final String BUY_MESSAGE = "\nWhat do you want to buy?" +
            "\nPlease enter: '1' - for espresso, '2' - for latte, " +
            "'3' - for cappuccino, 'back' - for main menu:";

    // In case of error, please remove FILL_MESSAGE!
    // The message was not required for the task, so it might cause trouble because of the extra print statement
    public final String FILL_MESSAGE = "\nEngage refilling mode.";
    public final String SET_WATER = "\nInput how many ml of water you want to add: ";
    public final String SET_MILK = "\nInput how many ml of milk you want to add: ";
    public final String SET_BEANS = "\nInput how many grams of coffee beans you want to add: ";
    public final String SET_CUPS = "\nInput how many disposable cups of coffee you want to add: ";
    public final String ERROR_MESSAGE_INVALID_STOCK_INT = "\nYou may only add amounts of 0 and above";

}
