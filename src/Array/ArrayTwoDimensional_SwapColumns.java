package Array;

import java.util.Scanner;

public class ArrayTwoDimensional_SwapColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int swap1 = 0;
        int swap2 = 1;

        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; i < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] swapMatrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (j == swap1) {
                    swapMatrix[i][j] = matrix[i][swap2];
                    continue;
                }
                if (j == swap2) {
                    swapMatrix[i][j] = matrix[i][swap1];
                    continue;
                }
                swapMatrix[i][j] = matrix[i][j];
            }
        }
        for (int[] nums : swapMatrix) {
            for (int nbrs : nums) {
                System.out.print(nbrs + " ");
            }
            System.out.println();
        }
    }
}
/*
Swap the columns
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.
Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.

 Sample Input:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1


 Sample Output:

12 11 13 14
22 21 23 24
32 31 33 34
 */