package kabraxis.project_coffee_machine.final_stage;

import java.util.Scanner;

public class InputReader {
   final private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

   public String readInput() {
        return scanner.nextLine().toLowerCase().trim();
    }


    public int getValidIntegerStock() {
        String errorMessageInvalidIntegerStock = "\nYou may only add amounts of 0 and above";
        int inputStock = scanner.nextInt();
        while (inputStock < 0) {
            System.out.println(errorMessageInvalidIntegerStock);
            inputStock = scanner.nextInt();
        }
        return inputStock;
    }


    public static String getValidSelectDrinkAction() {
        Scanner scanner = new Scanner(System.in);
        String getSelectDrinkAction = scanner.nextLine().toLowerCase();
        String regexPattern = "(?i)1|2|3|back";
        String errorMessage = "\nYou should enter numbers 1, 2, 3 or type back - to main menu";
        while (!getSelectDrinkAction.matches(regexPattern)) {
            System.out.println(errorMessage);
            getSelectDrinkAction = scanner.nextLine().toLowerCase();
        }
        return getSelectDrinkAction;
    }

}
