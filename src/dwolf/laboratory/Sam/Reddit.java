package dwolf.laboratory.Sam;

import java.util.Scanner;

public class Reddit {
    public static void main(String[] args) {
        handleInput();
    }

    public static void handleInput() {
        // pattern only allows positive integers
        final String regexPattern = "([-+]?\\d+)";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String userInput = scanner.nextLine();

        while (!userInput.matches(regexPattern)) {
            System.out.println("You may only input numbers.");
            handleInput();
        }

        System.out.println("The input is: " + userInput);
    }

    public static void myMethod() {

        try {

            throw new Exception();

        } catch (Exception e) {
            System.out.println("catch-block");
        }

        System.out.println("after try-catch");
    }
}



