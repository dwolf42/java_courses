package com.github.kabraxis.string;

import java.util.Scanner;

public class String_ProcessingString_ConvertADate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printIt(swapParts(splitInput(input)));
        // printIt calls swapParts, calls splitInput, calls input
    }

    // String[] splitInput is already an array, this method just fills it with the parts
    // that are left from input after the split and returns it.
    public static String[] splitInput(String input) {
        return input.split("-");
    }

    // First index of splitInput[] is saved to a temp variable, so we can put it to the end of
    // the array after the swap is finished.
    // For loop copies the 2nd index of splitInput[] to first index of reversed[].
    public static String[] swapParts(String[] splitInput) {
        String[] reversed = new String[splitInput.length];
        String temp = splitInput[0];
        for (int i = 0; i < 2; i++) {
            reversed[i] = splitInput[i + 1];
        }
        reversed[2] = temp;
        return reversed;
    }

    public static void printIt(String[] swapParts) {
        for (int i = 0; i < swapParts.length; i++) {
            System.out.print(swapParts[i]);
            if (i < 2) {
                System.out.print("/");
            }
        }
    }
}

/*
Convert a date
Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.


Sample Input:
2012-09-28

Sample Output:
09/28/2012
*/

