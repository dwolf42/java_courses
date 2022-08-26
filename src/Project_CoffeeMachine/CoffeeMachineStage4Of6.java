package Project_CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachineStage4Of6 {
    static int stockWater = 400;
    static int stockMilk = 540;
    static int stockCoffeeBeans = 120;
    static int stockCups = 9;
    static int stockMoney = 550;

    public static void main(String[] args) {
        while(true) {
            displayMachineStatus();
            selectMenu();
            displayMachineStatus();
        }
    }

    public static void displayMachineStatus() {
        System.out.printf("The coffee machine has:%n" +
                        "%d ml of water%n" +
                        "%d ml of milk%n" +
                        "%d g of coffee beans%n" +
                        "%d disposable cups%n" +
                        "$%d of money%n%n",
                stockWater, stockMilk, stockCoffeeBeans, stockCups, stockMoney);
    }

    public static void selectMenu() {
        System.out.println("Write action (buy, fill, take):");

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
            default:
                selectMenu();
        }
    }

    public static void selectDrink() {
        String displayedMessage = "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:";

        System.out.println(displayedMessage);

        switch (getValidIntegerSelectDrink()) {
            case 1 -> processEspresso(1);
            case 2 -> processLatte(1);
            case 3 -> processCappuccino(1);
            default -> selectDrink();
        }
    }

    public static void processEspresso(int orderedAmount) {
        int costWater = 250;
        int costMilk = 0;
        int costCoffeeBeans = 16;
        int costCups = 1;

        int chargeMoney = 4;

        String itemSelected = "Espresso";

        if (!isInStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups)) {
            confirmOrder(orderedAmount, itemSelected);
        } else {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, itemSelected);
        }
    }

    public static void processLatte(int orderedAmount) {
        int costWater = 350;
        int costMilk = 75;
        int costCoffeeBeans = 20;
        int costCups = 1;

        int chargeMoney = 7;

        String itemSelected = "Latte";

        if (!isInStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups)) {
            confirmOrder(orderedAmount, itemSelected);
        } else {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, itemSelected);
        }
    }

    public static void processCappuccino(int orderedAmount) {
        int costWater = 200;
        int costMilk = 100;
        int costCoffeeBeans = 12;
        int costCups = 1;

        int chargeMoney = 6;

        String itemSelected = "Cappuccino";

        if (!isInStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups)) {
            confirmOrder(orderedAmount, itemSelected);
        } else {
            alterStock(orderedAmount, costWater, costMilk, costCoffeeBeans, costCups, chargeMoney);
            confirmOrder(orderedAmount, itemSelected);
        }
    }

    public static boolean isInStock(int orderedAmount, int costWater, int costMilk, int costCoffeeBeans, int costCups) {
        return orderedAmount * costWater < stockWater &&
                orderedAmount * costMilk < stockMilk &&
                orderedAmount * costCoffeeBeans < stockCoffeeBeans &&
                orderedAmount * costCups < stockCups;
    }

    public static void alterStock(int orderedAmount, int costWater, int costMilk, int costCoffeeBeans, int costCups, int chargeMoney) {
        System.out.println("<<<<<<altering stock>>>>>");
        stockWater -= orderedAmount * costWater;
        stockMilk -= orderedAmount * costMilk;
        stockCoffeeBeans -= orderedAmount * costCoffeeBeans;
        stockCups -= orderedAmount * costCups;
        stockMoney += chargeMoney;
    }

    public static void fillStock() {
        System.out.println("Write how many ml of water you want to add:");
        stockWater += getValidIntegerStock();
        System.out.println("Write how many ml of milk you want to add:");
        stockMilk += getValidIntegerStock();
        System.out.println("Write how many grams of coffee beans you want to add:");
        stockCoffeeBeans += getValidIntegerStock();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        stockCups += getValidIntegerStock();
    }

    public static void takeMoney() {
        System.out.printf("I gave you $%d%n%n", stockMoney);
        stockMoney -= stockMoney;
    }

    public static int getValidIntegerStock() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt() || !scanner.hasNext("\\d+")) {
            System.out.println("You should enter numbers");
            scanner.next(); // clears scanner
        }
        return scanner.nextInt();
    }

    public static String getValidMenuAction() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("(?i)buy|fill|take")) {
            System.out.println("You should enter buy, fill or take");
            scanner.next();
        }
        return scanner.nextLine().toLowerCase();
    }

    public static int getValidIntegerSelectDrink() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt(1 | 2 | 3)) {
            System.out.println("You should enter numbers 1, 2 or 3");
            scanner.next(); // clears scanner
        }
        return scanner.nextInt();
    }

    public static void confirmOrder(int orderedAmount, String itemSelected) {
        if (orderedAmount == 0) {
            System.out.printf("Sorry we are out of stock, your order of %d %s/s is not possible%n%n",
                    orderedAmount, itemSelected);
        }
        System.out.printf("Thank you for your order, please enjoy your %d %s/s%n%n",
                orderedAmount, itemSelected);
    }

}

/*
Description
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them require only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from the standard input, which can be "buy", "fill", or "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill up all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then they must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
If the user writes "fill", the program should ask them how much water, milk, coffee, and how many disposable cups they want to add to the coffee machine.

If the user writes "take" the program should give them all the money that it earned from selling coffee.

At the start, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s state after that. Try to use methods to implement every action that the coffee machine can do.

Instruction
Write a program that offers to buy one cup of coffee, to fill up the ingredients, or to take its money. At the same time, the program should calculate how many ingredients it has left. And also display the number of ingredients before and after purchase.

Examples

An espresso should be as number 1 in the list, a latte as number 2 and a cappuccino as number 3.
Options also should be named as "buy", "fill", "take".
The symbol > represents the user input. Note that it's not part of the input.

Example 1

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take):
> buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:
> 3

The coffee machine has:
200 ml of water
440 ml of milk
108 g of coffee beans
8 disposable cups
$556 of money


Example 2

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take):
> fill
Write how many ml of water you want to add:
> 2000
Write how many ml of milk you want to add:
> 500
Write how many grams of coffee beans you want to add:
> 100
Write how many disposable cups of coffee you want to add:
> 10

The coffee machine has:
2400 ml of water
1040 ml of milk
220 g of coffee beans
19 disposable cups
$550 of money


Example 3

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take):
> take
I gave you $550

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$0 of money
 */