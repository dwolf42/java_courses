package Project_CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachineStage4Of6 {

    static int stockWater;
    static int stockMilk;
    static int stockCoffeeBeans;
    static int stockCups;
    static int stockMoney;


    public static void main(String[] args) {


        int availableWater;
        int availableMilk;
        int availableCoffeeBeans;

        int requestedCups;

        System.out.println("Write how many ml of water the coffee machine has:");
        availableWater = getValidInput();
        System.out.println("Write how many ml of milk the coffee machine has:");
        availableMilk = getValidInput();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        availableCoffeeBeans = getValidInput();
        System.out.println("Write how many cups of coffee you will need:");
        requestedCups = getValidInput();

        // Possible cups of coffee
        int availableCupsBySupply;

        int possibleCupsWater = availableWater / requiredWater;
        int possibleCupsMilk = availableMilk / requiredMilk;
        int possibleCupsCoffeeBeans = availableCoffeeBeans / requiredCoffeeBeans;

        if (possibleCupsWater < possibleCupsMilk && possibleCupsWater < possibleCupsCoffeeBeans) {
            availableCupsBySupply = possibleCupsWater;
        } else if (possibleCupsMilk < possibleCupsCoffeeBeans) {
            availableCupsBySupply = possibleCupsMilk;
        } else {
            availableCupsBySupply = possibleCupsCoffeeBeans;
        }

        if (availableCupsBySupply == requestedCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (availableCupsBySupply > requestedCups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)%n", (availableCupsBySupply - requestedCups));
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee%n", (availableCupsBySupply));
        }

    }

    public static int getValidInput() {
        Scanner scanner = new Scanner(System.in);

        int validatedNum;

        while (!scanner.hasNextInt()) {
            System.out.println("You should enter numbers");
            scanner.next(); // clears scanner
        }
        validatedNum = scanner.nextInt();

        return validatedNum;
    }

    public static void changeStockEspresso(int stockWater, int stockMilk, int stockCoffeeBeans, int stockCups, int stockMoney) {
        int costMoneyEspresso = 4;

    }

    public static void changeStockLatte(int stockWater, int stockMilk, int stockCoffeeBeans, int stockCups, int stockMoney) {
        int costMoneyLatte = 7;

    }

    public static void changeStockCappuccino(int stockWater, int stockMilk, int stockCoffeeBeans, int stockCups, int stockMoney) {
        int costMoneyCappuccino = 6;
    }

    public static void fillSupplies() {

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