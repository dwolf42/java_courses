package dwolf.laboratory;

import java.util.Scanner;

public class Inputvalidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexPosInt = "([+]?\\d+)";

        System.out.println("You may input any positive number:");

        while (true) {
            try {
                String input = scanner.nextLine();

                if (!input.matches(regexPosInt)) {
                    System.out.println("Please input a positive number:");
                } else {
                    printString(input);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a positive number");
                scanner.next(); // clears the invalid input
            }
        }
        scanner.close();
    }

    public static void printString(String input) {
        System.out.println(input);
    }
}
