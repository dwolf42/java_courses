package kabraxis.array;

import java.util.Scanner;

public class Array_SumArrayElementsGraterThanValue_V1 {
    public static void main(String[] args) {
        // Yes, that value is never used.
        // I could write some code in which this variable might be used
        // but since I use .split() method, I don't need it.
        // So it's only implemented for the sake of the program to run.
        int arrayLength = getIntValue();

        calculateSum(makeIntArray(getNumsAsString()));
    }

    public static int getIntValue() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "\nYou may only input numbers";
        String pattern = "([-+])?\\d+";
        String readValue = scanner.nextLine();
        while (!readValue.matches(pattern)) {
            System.out.println(errorMessage);
            readValue = scanner.nextLine();
        }
        return Integer.parseInt(readValue);
    }

    public static String[] getNumsAsString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(" ");
    }

    public static int[] makeIntArray(String[] getNumsAsString) {
        int[] arrayOfInts = new int[getNumsAsString.length];
            for (int i = 0; i < getNumsAsString.length; i++) {
                arrayOfInts[i] = Integer.parseInt(getNumsAsString[i]);
            }
        return arrayOfInts;
    }

    public static void calculateSum(int[] makeIntArray) {
        int greaterThanValue = getIntValue();
        int sumOfNums = 0;
        for (int i =0; i < makeIntArray.length; i++) {
            if (greaterThanValue < makeIntArray[i]) {
                sumOfNums += makeIntArray[i];
            }
        }
        printIt(sumOfNums);
    }

    public static void printIt(int sumOfNums) {
        System.out.println(sumOfNums);
    }
}
/*
Sum array elements greater than a value
Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains the elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.


Sample Input:
5
5 8 11 2 10
8

Sample Output:
21


Sample Input:
4
-5 -4 -6 -11
-10

Sample Output:
-15
*/