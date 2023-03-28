package kabraxis.project_coffee_machine.final_stage;

public class CoffeeMachine {
    // This is the default stock of the machine
    private int stockWater;
    private int stockMilk;
    private int stockCoffeeBeans;
    private int stockCups;
    private int stockMoney;

    MachineState state;
    DrinkTypes drink;

    // No-argument constructor to initialize the instance of the class
    CoffeeMachine() {
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
        this.state = MachineState.SELECT;
    }

    void processInstruction(String userInput) {
        switch (state) {
            case BUY:
                if (userInput.equals("1")) {
                    drink = DrinkTypes.ESPRESSO;
                    cookCoffee();
                }
                if (userInput.equals("2")) {
                    drink = DrinkTypes.LATTE;
                    cookCoffee();
                }
                if (userInput.equals("3")) {
                    drink = DrinkTypes.CAPPUCCINO;
                    cookCoffee();
                }
                if (userInput.equals("exit")) {
                    state = MachineState.SELECT;
                    Main.handleState();
                }
                break;
            case FILL_WATER:
                stockWater = Integer.parseInt(userInput);
                state = MachineState.FILL_MILK;
                Main.handleState();
                break;
            case FILL_MILK:
                stockWater = Integer.parseInt(userInput);
                state = MachineState.FILL_BEANS;
                Main.handleState();
                break;
            case FILL_BEANS:
                stockWater = Integer.parseInt(userInput);
                state = MachineState.FILL_CUPS;
                Main.handleState();
                break;
            case FILL_CUPS:
                stockWater = Integer.parseInt(userInput);
                state = MachineState.SELECT;
                Main.handleState();
                break;
            case TAKE_MONEY:
                stockMoney -= stockMoney;
                state = MachineState.SELECT;
                Main.handleState();
                break;
        }
    }

    private void cookCoffee() {
        DisplayMessages messages = new DisplayMessages();
        String whatsMissing = findMissingItem();
        if (!whatsMissing.equals("none")) {
            // String is not in DisplayMessages class, as printf is easier to read.
            System.out.printf("Sorry, not enough %s!%n%n", whatsMissing);
            state = MachineState.SELECT;
            Main.handleState();
        }

        stockWater -= drink.getCostWater();
        stockMilk -= drink.getCostMilk();
        stockCoffeeBeans -= drink.costBeans();
        stockCups -= drink.costCups();
        stockMoney += drink.costMoney();
        System.out.println(messages.CONFIRM_ORDER);
        state = MachineState.SELECT;
        Main.handleState();
    }

    private String findMissingItem() {
        if (drink.getCostWater() < stockWater) {
            return "water";
        } else if (drink.getCostMilk() < stockMilk) {
            return "milk";
        } else if (drink.costBeans() < stockCoffeeBeans) {
            return "coffe beans";
        } else if (drink.costCups() < stockCups) {
            return "cups";
        }

        return "none";
    }

    int getStockMoney() {
        return stockMoney;
    }

}
