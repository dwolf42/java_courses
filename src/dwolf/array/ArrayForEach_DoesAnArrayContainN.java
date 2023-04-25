package dwolf.array;

import java.util.Scanner;

public class ArrayForEach_DoesAnArrayContainN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] sequenceArray = new int[defineLength];

        for (int i = 0; i < sequenceArray.length; i++) {

            sequenceArray[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        boolean containsN = false;

        for (int x : sequenceArray) {

            if (x == n) {
                containsN = true;
                break;
            }
        }

        System.out.println(containsN);
    }
}
/*
    Write a program that reads an array of integers and an integer. The program must check if the array contains that number.

        Input data format

        The first line: the size of an array.

        The second line: all the elements of the array separated by the space.

        The third line: one integer.

        Output data format

        Only a single value: true or false.


        Sample Input:
        3
        1 3 2
        3

        Sample Output:
        true


        Sample Input:
        5
        1 3 2 5 4
        7

        Sample Output:
        false

 */