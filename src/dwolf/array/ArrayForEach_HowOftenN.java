package dwolf.array;

import java.util.Scanner;

public class ArrayForEach_HowOftenN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] arrayOccur = new int[defineLength];

        for (int i = 0; i < arrayOccur.length; i++) {
            arrayOccur[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        int counter = 0;
        for (int checker : arrayOccur) {

            if (checker == n) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
/*
    Write a program that reads an array of ints and an integer number n.

        The program must check how many times n occurs in the array.

        Input data format
        The first line contains the size of the input array.

        The second line contains elements of the array separated by spaces.

        The third line contains n.

        Output data format

        The result is only a single non-negative integer number.

        Sample Input 1:

        6
        1 2 3 4 2 1
        2
        Sample Output 1:

        2
*/
