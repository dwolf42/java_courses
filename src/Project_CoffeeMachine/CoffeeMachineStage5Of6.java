package Project_CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachineStage5Of6 {
    static int stockWater = 400;
    static int stockMilk = 540;
    static int stockCoffeeBeans = 120;
    static int stockCups = 9;
    static int stockMoney = 550;

    public static void main(String[] args) {
            displayMachineStatus();
//            selectMenu();
    }

    public static void displayMachineStatus() {
        System.out.printf("The coffee machine has:%n" +
                        "%d ml of water%n" +
                        "%d ml of milk%n" +
                        "%d g of coffee beans%n" +
                        "%d disposable cups%n" +
                        "$%d of money%n%n",
                stockWater, stockMilk, stockCoffeeBeans, stockCups, stockMoney);
        selectMenu();
    }

    public static void selectMenu() {
        String message = "Write action (buy, fill, take, remaining, exit): ";
        System.out.println(message);
        switch (getValidMenuAction()) {
            case "buy":
                selectDrink();
                break;
            case "fill":
                fillStock();
                break;
            case "take":
                takeMoney();
                break;
            case "remaining":
                displayMachineStatus();
                break;
            case "exit":
                // in case there is rage against, this might terminate the machine
                break;
            default:
                selectMenu();
                break;
        }
    }

    public static void selectDrink() {
        String displayedMessage = "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:";
        System.out.println(displayedMessage);
        switch (getValidIntegerSelectDrink()) {
            case 1:
                processEspresso(1);
                break;
            case 2:
                processLatte(1);
                break;
            case 3:
                processCappuccino(1);
                break;
            default:
                selectDrink();
                break;
        }
    }

    public static void processEspresso(int orderedAmount) {
        int costWater = 250;
        int costMilk = 0;
        int costCoffeeBeans = 16;
        int costCups = 1;

        int chargeMoney = 4;

        String itemSelected = "Espresso";
        String missingItem = findMissingItem(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups);

        if (missingItem.equals("none")) {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, missingItem);
        } else {
            confirmOrder(0, missingItem);
        }
    }

    public static void processLatte(int orderedAmount) {
        int costWater = 350;
        int costMilk = 75;
        int costCoffeeBeans = 20;
        int costCups = 1;

        int chargeMoney = 7;

        String itemSelected = "Latte";
        String missingItem = findMissingItem(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups);

        if (missingItem.equals("none")) {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, missingItem);
        } else {
            confirmOrder(0, missingItem);
        }
    }

    public static void processCappuccino(int orderedAmount) {
        int costWater = 200;
        int costMilk = 100;
        int costCoffeeBeans = 12;
        int costCups = 1;

        int chargeMoney = 6;

        String itemSelected = "Cappuccino";
        String missingItem = findMissingItem(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups);

        if (missingItem.equals("none")) {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, missingItem);
        } else {
            confirmOrder(0, missingItem);
        }
    }

    public static String findMissingItem(int orderedAmount, int costWater, int costMilk, int costCoffeeBeans,
                                         int costCups) {
        if (orderedAmount * costWater > stockWater) {
            return "water";
        } else if (orderedAmount * costMilk > stockMilk) {
            return "milk";
        } else if (orderedAmount * costCoffeeBeans > stockCoffeeBeans) {
            return "coffee beans";
        } else if (orderedAmount * costCups > stockCups) {
            return "cups";
        } else {
            return "none";
        }
    }

    public static void alterStock(int orderedAmount, int costWater, int costMilk, int costCoffeeBeans,
                                  int costCups, int chargeMoney) {
        stockWater -= orderedAmount * costWater;
        stockMilk -= orderedAmount * costMilk;
        stockCoffeeBeans -= orderedAmount * costCoffeeBeans;
        stockCups -= orderedAmount * costCups;
        stockMoney += chargeMoney;
    }

    public static void fillStock() {
        String howMuchWater = "Write how many ml of water you want to add:";
        String howMuchMilk = "Write how many ml of milk you want to add:";
        String howMuchCoffeeBeans = "Write how many grams of coffee beans you want to add:";
        String howMuchCups = "Write how many disposable cups of coffee you want to add:";
        System.out.println(howMuchWater);
        stockWater += getValidIntegerStock();
        System.out.println(howMuchMilk);
        stockMilk += getValidIntegerStock();
        System.out.println(howMuchCoffeeBeans);
        stockCoffeeBeans += getValidIntegerStock();
        System.out.println(howMuchCups);
        stockCups += getValidIntegerStock();
        selectMenu();
    }

    public static void takeMoney() {
        stockMoney -= stockMoney;
        System.out.printf("I gave you $%d%n%n", stockMoney);
        selectMenu();
    }

    public static int getValidIntegerStock() {
        String errorMessage = "You may only add amounts of 0 and above";
        Scanner scanner = new Scanner(System.in);
        int inputStock = scanner.nextInt();
        while (inputStock < 0) {
            System.out.println(errorMessage);
            inputStock = scanner.nextInt();
        }
        return inputStock;
    }

    public static String getValidMenuAction() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "You should enter buy, fill or take";
        while (!scanner.hasNext("(?i)buy|fill|take|remaining|exit")) {
            System.out.println(errorMessage);
            scanner.next();
        }
        return scanner.nextLine().toLowerCase();
    }

    public static int getValidIntegerSelectDrink() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "You should enter numbers 1, 2 or 3";
        int selectDrink = scanner.nextInt();
        while (selectDrink < 0 || selectDrink > 3) {
            System.out.println(errorMessage);
            selectDrink = scanner.nextInt();
        }
        return selectDrink;
    }

    public static void confirmOrder(int orderedAmount, String missingItem) {
        if (orderedAmount == 0) {
            System.out.printf("Sorry, not enough %s!%n%n",
                    missingItem);
        } else {
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }
}

/*
Description
But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit". Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has. This means that you shouldn't show the remaining stock levels at the beginning/end of the program.

Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee and state what is missing.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, he should be able to type "back" to return into the main cycle.

Remember, that:

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
Instruction
Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.

Example
Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash).
The symbol > represents the user input. Note that it's not part of the input.

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):
> fill

Write how many ml of water you want to add:
> 1000
Write how many ml of milk you want to add:
> 0
Write how many grams of coffee beans you want to add:
> 0
Write how many disposable cups of coffee you want to add:
> 0

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit):
> buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit):
> take

I gave you $564

Write action (buy, fill, take, remaining, exit):
> remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit):
> exit
 */