package String;

import java.util.Scanner;

public class String_SortingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(order(scanner.nextLine()));
    }

    public static String order(String words) {
        String output = "";
        // If input is null print empty string
        if (words.length() == 0) {
            return output;
        } else {
            // Split input into an array
            String[] inputSplit = words.split(" ");
            // Creating second array to sort input
            String[] sortingInput = new String[inputSplit.length];
            // Iterate through each element of the array
            for (String sting : inputSplit) {
                // Iterate through each individual string of the array
                for (int i = 0; i < sting.length(); i++) {
                    // Checks if character of the string is digit
                    if (Character.isDigit(sting.charAt(i))) {
                        // Gets int-value of the character, puts it at the correct index of 2nd array
                        sortingInput[Character.getNumericValue(sting.charAt(i)) - 1] = sting;
                    }
                }
            }
            for (int i = 0; i < sortingInput.length; i++) {
                // Puts every string of sortingInput[] together to form a new string
                // Adds whitespace to string if it isn't the last string
                output = output.concat(sortingInput[i]);
                if (i != sortingInput.length - 1) {
                    output += " ";
                }
            }
        }
        return output;
    }
}
/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */