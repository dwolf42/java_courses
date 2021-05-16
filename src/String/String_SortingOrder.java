package String;

import java.util.*;

public class String_SortingOrder {
    public static void main(String[] args) {
        String dummyInput = "is2 Thi1s T4est 3a";
        String[] input = dummyInput.split(" ");
        int position = 0;
        String output = "";

        for (String sting : input) {
            for (int i = 0; i < sting.length(); i++) {
                if (Character.isDigit(sting.charAt(i))) { // checks whether the index is an int or not
                    if (position == 0) { // Sets the first word at the first position
                        output = sting + " ";
                        position = Character.getNumericValue(sting.charAt(i)); // parses the int-value of the index
                    }
                    if (Character.getNumericValue(sting.charAt(i)) > position) {
                        output = output.concat(sting) + " ";
                        position = Character.getNumericValue(sting.charAt(i)); // parses the int-value of the index
                    }
                    if (Character.getNumericValue(sting.charAt(i)) < position) {
                        output = " " + sting.concat(output);
                        position = Character.getNumericValue(sting.charAt(i)); // parses the int-value of the index
                    }
                }
            }
        }
        System.out.println(output);

    }
}
/*
is2, pos 2
T

 */

