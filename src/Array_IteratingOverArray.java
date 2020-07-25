import java.util.Scanner;
import java.util.Arrays;

public class Array_IteratingOverArray {
    public static void main(String[] args) {
        array1();
    }

    // Example 1. Filling an array with the squares of indexes of its elements.
    public static void array1() {
        int n = 10; // size of an array
        int[] squares = new int[n]; // creating an array with the specific size of n

        System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iteratinf over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] /* defines the arrays index position to modify*/ = i * i /* defines what to put into that position*/;
        }
        System.out.println(Arrays.toString(squares));
    }

    // Example 2. Checking the order of elements.
    public static void array2() {

    }
}

