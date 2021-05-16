package String;

import java.util.Scanner;

public class String_SortingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting user input, split it to array
        String[] input = scanner.nextLine().split(" ");
        if (input == null || input.length == 0) {
            System.out.print(" ");
        } else {
            // Creating second array to sort input
            String[] sortingInput = new String[input.length];

            for (String sting : input) {
                for (int i = 0; i < sting.length(); i++) {
                    // Checks if character is digit
                    if (Character.isDigit(sting.charAt(i))) {
                        // Gets int-value of the character, puts it at the correct index of 2nd array
                        sortingInput[Character.getNumericValue(sting.charAt(i)) - 1] = sting;
                    }
                }
            }
            for (String kabraxis : sortingInput) {
                System.out.print(kabraxis + " ");
            }
        }
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