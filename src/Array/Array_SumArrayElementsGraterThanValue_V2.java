package Array;

import java.util.Scanner;

public class Array_SumArrayElementsGraterThanValue_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[scanner.nextInt()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        int referenceNum = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > referenceNum) {
                sum += intArray[i];
            }
        }

        System.out.println(sum);
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