import java.util.Scanner;

public class CoffeeMachineStage3Of6 {
    public static void main(String[] args) {
        int requiredWater = 200;
        int requiredMilk = 50;
        int requiredCoffeeBeans = 15;

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

}

/*
Description
A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.

Instruction
Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.

Examples
The program should firstly request for water, then milk, then beans, and then the number of cups.
The symbol > represents the user input. Note that it's not part of the input.

Example 1

Write how many ml of water the coffee machine has:
> 300
Write how many ml of milk the coffee machine has:
> 65
Write how many grams of coffee beans the coffee machine has:
> 100
Write how many cups of coffee you will need:
> 1
Yes, I can make that amount of coffee


Example 2

Write how many ml of water the coffee machine has:
> 500
Write how many ml of milk the coffee machine has:
> 250
Write how many grams of coffee beans the coffee machine has:
> 200
Write how many cups of coffee you will need:
> 10
No, I can make only 2 cup(s) of coffee


Example 3

Write how many ml of water the coffee machine has:
> 1550
Write how many ml of milk the coffee machine has:
> 299
Write how many grams of coffee beans the coffee machine has:
> 300
Write how many cups of coffee you will need:
> 3
Yes, I can make that amount of coffee (and even 2 more than that)


Example 4

Write how many ml of water the coffee machine has:
> 0
Write how many ml of milk the coffee machine has:
> 0
Write how many grams of coffee beans the coffee machine has:
> 0
Write how many cups of coffee you will need:
> 1
No, I can make only 0 cup(s) of coffee


Example 5

Write how many ml of water the coffee machine has:
> 0
Write how many ml of milk the coffee machine has:
> 0
Write how many grams of coffee beans the coffee machine has:
> 0
Write how many cups of coffee you will need:
> 0
Yes, I can make that amount of coffee


Example 6

Write how many ml of water the coffee machine has:
> 200
Write how many ml of milk the coffee machine has:
> 50
Write how many grams of coffee beans the coffee machine has:
> 15
Write how many cups of coffee you will need:
> 0
Yes, I can make that amount of coffee (and even 1 more than that)
 */