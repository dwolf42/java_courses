package kabraxis.array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayForLoop_LongestAscendingSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int indexOnSave = 0;
        int sequenceToPrint = 0;

        int[] arrayForInput = new int[defineLength];
        int[] saveLongestSequence = new int[defineLength];

        Arrays.fill(saveLongestSequence, 1);

        for (int i = 0; i < arrayForInput.length; i++) {
            arrayForInput[i] = scanner.nextInt();
        }

        for (int k = 1; k < arrayForInput.length; k++) {

            if (arrayForInput[k] > arrayForInput[k - 1]) {
                saveLongestSequence[indexOnSave]++;
            } else {
                indexOnSave++;
            }
        }

        for (int l = 0; l < saveLongestSequence.length; l++) {

            if (saveLongestSequence[l] > sequenceToPrint) {
                sequenceToPrint = saveLongestSequence[l];
            }
        }

        System.out.println(sequenceToPrint);
    }
}
/*
Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after
another. A single number is assumed to be ordered sequence with the length = 1.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Example

The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

Sample Input 1:

10

1 2 4 1 2 3 5 7 4 3

Sample Output 1:

5

*/