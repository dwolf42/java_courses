package kabraxis.array;

import java.util.Scanner;

public class Array_ShiftArrayToRight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] incomingArray = new int[length];

        for (int i = 0; i < incomingArray.length - 1; i++) {
            incomingArray[i] = scanner.nextInt();
        }

        int[] newArray = shiftMultiple(incomingArray, scanner.nextInt());
        printArray(newArray);
    }

    //Pushes the array the desired amount of times through the sifter.
    public static int[] shiftMultiple(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            shiftArrayRight(arr);
        }
        return arr;
    }

    //Takes in an array of integers then returns a new array
    //with all the values shifted right.
    public static int[] shiftArrayRight(int[] array1) {
        //Saves the last position of the array in a temporary variable
        int tempVariable = array1[array1.length - 1];
        //Loop starts at the 2nd-last pos. of array1 (number 7).
        for (int i = array1.length - 2; i > -1; i--) {
            //At each iteration of the loop copy the element of position i to position i + 1.
            array1[i + 1] = array1[i];
        }
        //Finally copy value of tempVariable to first position of the array1 and return the array.1
        array1[0] = tempVariable;
        return array1;
    }

    //Takes an array of integers and prints it to console
    public static void printArray(int[] arrr) {
        for (int x : arrr)
            System.out.print(x + ",");
    }
}




