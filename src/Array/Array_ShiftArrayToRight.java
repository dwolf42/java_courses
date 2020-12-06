package Array;

import java.util.Scanner;

public class Array_ShiftArrayToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getNumOfArray = scanner.nextLine(); // 1 2 3 4 5
        int times = scanner.nextInt() % getNumOfArray.length();                                 // 0  1  2  3  4
        String[] stringInputToArray = getNumOfArray.split(" "); // [ 1, 2, 3, 4, 5 ]
        int[] actualArray = new int [stringInputToArray.length]; // 12345

        for (int i = 0; i < stringInputToArray.length; i++) {
            String partOfString = stringInputToArray[i];
            int convert = Integer.parseInt(partOfString);
            actualArray[i] = convert;
        }

        int[] rotatedArray = shiftArrayTimes(actualArray, times);
        printIt(rotatedArray);
    }

    public static int[] shiftArrayTimes(int[] arrayFromActualArray, int times) {
        for (int i = 0; i < times; i++) {
            shiftArrayToRight(arrayFromActualArray);
        }
        return arrayFromActualArray;
    }

    public static int[] shiftArrayToRight(int[] arrayFromShiftArrayTimes) {
        int saveLastIndex = arrayFromShiftArrayTimes[arrayFromShiftArrayTimes.length - 1];

        for (int i = arrayFromShiftArrayTimes.length - 2; i > -1; i--) {
            arrayFromShiftArrayTimes[i + 1] = arrayFromShiftArrayTimes[i];
        }
        arrayFromShiftArrayTimes[0] = saveLastIndex;
        return arrayFromShiftArrayTimes;
    }

    public static void printIt(int[] arrayFromRotatedArray) {
        for (int enorila : arrayFromRotatedArray) {
            System.out.print(enorila + " ");
        }
    }
}