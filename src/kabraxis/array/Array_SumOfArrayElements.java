package kabraxis.array;

import java.util.Scanner;

public class Array_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] array = new int[defineLength];

        for (int i = 0; i < defineLength; i++) {
            array[i] = scanner.nextInt();
        }

        int countNumbers = 0;
        for (int num : array) {
            countNumbers += num;
        }
        System.out.println(countNumbers);
    }
}
/*
Write a program that calculates the sum of the elements of an array of ints.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

The sum of the input array elements.

Sample Input 1:

3
1 2 3

Sample Output 1:

6
 */