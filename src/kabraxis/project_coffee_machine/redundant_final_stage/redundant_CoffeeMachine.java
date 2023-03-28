package kabraxis.project_coffee_machine.redundant_final_stage;

public class redundant_CoffeeMachine {
    // This is the default stock of the machine
    private int stockWater;
    private int stockMilk;
    private int stockCoffeeBeans;
    private int stockCups;
    private int stockMoney;

    private redundant_MachineState state;

    redundant_InputReader reader = new redundant_InputReader();
    redundant_DisplayMessages messages = new redundant_DisplayMessages();

    // No-argument constructor to initialize the instance of the class
    redundant_CoffeeMachine() {
        final int stockWater = 400;
        final int stockMilk = 540;
        final int stockCoffeeBeans = 120;
        final int stockCups = 9;
        final int stockMoney = 550;

        this.stockWater = stockWater;
        this.stockMilk = stockMilk;
        this.stockCoffeeBeans = stockCoffeeBeans;
        this.stockCups = stockCups;
        this.stockMoney = stockMoney;
        this.state = redundant_MachineState.SELECT;
    }

    public void processor() {
        switch (state) {
            case SELECT:
                System.out.println(messages.SELECT_MESSAGE);
                inputToState(reader.getInput());
                break;
            case BUY:
                System.out.println(messages.BUY_MESSAGE);
                buyMenu(reader.getInput());
                break;
            // For the FILL statuses I found it less confusing to invoke the reader objekt and passed messages as
            // arguments, than passing the messages object plus the SET message.
            case FILL_WATER:
                System.out.println(messages.SET_WATER);
                fillMenu(reader.getInput(messages.ERROR_MESSAGE_INVALID_STOCK_INT, messages.SET_WATER));
                break;
            case FILL_MILK:
                System.out.println(messages.SET_MILK);
                fillMenu(reader.getInput(messages.ERROR_MESSAGE_INVALID_STOCK_INT, messages.SET_MILK));
                break;
            case FILL_BEANS:
                System.out.println(messages.SET_BEANS);
                fillMenu(reader.getInput(messages.ERROR_MESSAGE_INVALID_STOCK_INT, messages.SET_BEANS));
                break;
            case FILL_CUPS:
                System.out.println(messages.SET_CUPS);
                fillMenu(reader.getInput(messages.ERROR_MESSAGE_INVALID_STOCK_INT, messages.SET_CUPS));
                break;
            default:
                System.out.println("Error! Shutting down system!");
                break;
        }


    }

    public void inputToState(String input) {
        switch (input) {
            case "buy":
                state = redundant_MachineState.BUY;
                processor();
                break;
            case "fill":
                state = redundant_MachineState.FILL_WATER;
                processor();
                break;
            case "take":
//                takeMoney();
                break;
            case "remaining":
//                remaining();
                break;
            case "exit":
//                exit();
                break;
            default:
                System.out.println(messages.ERROR_MESSAGE);
                processor();
                break;
        }
    }

    private void buyMenu(String input) {
        switch (input) {
            case "1":
//                processEspresso(input);
                state = redundant_MachineState.SELECT;
                processor();
                break;
            case "2":
//                processLatte(input);
                state = redundant_MachineState.SELECT;
                processor();
                break;
            case "3":
//                processCappuccino(input);
                state = redundant_MachineState.SELECT;
                processor();
                break;
            case "back":
                state = redundant_MachineState.SELECT;
                processor();
                break;
            default:
                System.out.println(messages.ERROR_MESSAGE);
                processor();
                break;
        }
    }

    private void fillMenu(String input) {

        System.out.println("Int Input " + input);


    }


}



