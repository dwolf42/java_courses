package kabraxis.project_coffee_machine.redundant_final_stage;

import java.util.Scanner;

public class redundant_InputReader {
    final private Scanner SCANNER;
    private final String REGEX_INT_RANGE = "^[1-9]\\d{0,1}$|^100$";
    private String inputStock;


    public redundant_InputReader() {
        SCANNER = new Scanner(System.in);
    }

    public String getInput() {
        return SCANNER.nextLine().toLowerCase().trim();
    }

    // For the FILL statuses I found it less confusing to invoke the reader objekt and passed messages as
    // arguments, than passing the messages object plus the SET message.
    public String getInput(String ERROR_MESSAGE_INVALID_STOCK_INT, String SET_MESSAGES) {
        while (!SCANNER.nextLine().matches(REGEX_INT_RANGE)) {
            System.out.println(ERROR_MESSAGE_INVALID_STOCK_INT);
            inputStock = SCANNER.next();
        }
        return inputStock;
    }


    public String getValidSelectDrinkAction() {
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
