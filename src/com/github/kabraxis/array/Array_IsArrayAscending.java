package com.github.kabraxis.array;

import java.util.Scanner;

public class Array_IsArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] array = new int[defineLength];
        boolean isAscending = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] < array[j - 1]) {
                isAscending = true;
                break;
            }
        }
        System.out.println(isAscending ? "false" : "true");
    }
}
/*
    Write a program that reads an array of int's and checks the array is sorted ascending (from smallest to largest number).

        Input data format

        The first line contains the size of an array.
        The second line contains elements of the array separated by spaces.

        Output data format

        Only a single value: true or false.

        Sample Input 1:
        4
        1 2 3 4

        Sample Output 1:
        true

        Sample Input 2:
        4
        1 2 3 0

        Sample Output 2:
        false
*/
