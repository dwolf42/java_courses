package kabraxis.project_coffee_machine.final_stage;

public class CoffeeMachineStage6Of6 {
    // This is the default stock of the machine
    private static int stockWater = 400;
    private static int stockMilk = 540;
    private static int stockCoffeeBeans = 120;
    private static int stockCups = 9;
    private static int stockMoney = 550;

    private static final String ERROR_MESSAGE = "\nError! Invalid input.";

    enum Machine {
        SELECT,
        BUY,
        FILL,
    }

    static Machine state = Machine.SELECT;
    static InputReader reader = new InputReader();

    // In case of error, please remove FILL_MESSAGE!
    // The message was not required for the task, so it might cause trouble because of the extra print statement
    public static void main(String[] args) {
        run(null);

    }

    public static void run(String input) {
        final String SELECT_MESSAGE = "Please enter an action \"buy, fill, take, remaining, exit\": ";
        final String BUY_MESSAGE = "\nWhat do you want to buy?" +
                "\nPlease enter: '1' - for espresso, '2' - for latte, " +
                "'3' - for cappuccino, 'back' - for main menu:";
        final String FILL_MESSAGE = "\nEngage refilling mode.";

        if (state.equals(Machine.SELECT)) {
            System.out.println(SELECT_MESSAGE);
            input = reader.readInput();
            switch (input) {
                case "buy":
                    state = Machine.BUY;
                    run(input);
                    break;
                case "fill":
                    state = Machine.FILL;
                    break;
//            case "take":
//                takeMoney();
//                break;
                default:
                    System.out.println(ERROR_MESSAGE);
                    run(input);
                    break;
            }

        } else if (state.equals(Machine.BUY)) {
            System.out.println(BUY_MESSAGE);
        } else if (state.equals(Machine.FILL)) {
            System.out.println(FILL_MESSAGE);
        } else {
            System.out.println("Error! Shutting down system!");
        }




    }


    private static void buyMenu(String input) {
        switch (input) {
            case "1":
//                processEspresso(input);
                System.out.println("Here's your espresso!");
                break;
            case "2":
//                processLatte(input);
                System.out.println("Here's your latte!");
                break;
            case "3":
//                processCappuccino(input);
                System.out.println("Here's your cappuccino!");
                break;
            case "back":
                state = Machine.SELECT;
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                run(input);
                break;
        }
    }

    private static void fillMenu(String input) {
        final String SET_WATER = "\nWrite how many ml of water you want to add:";
        final String SET_MILK = "\nWrite how many ml of milk you want to add:";
        final String SET_BEANS = "\nWrite how many grams of coffee beans you want to add:";
        final String SET_CUPS = "\nWrite how many disposable cups of coffee you want to add:";

    }
}
