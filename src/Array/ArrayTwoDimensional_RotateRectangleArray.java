package Array;

import java.util.Scanner;

public class ArrayTwoDimensional_RotateRectangleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depth = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] matrixHorizon = new int[depth][width];

        for (int i = 0; i < matrixHorizon.length; i++) {
            for (int j = 0; j < matrixHorizon[0].length; j++) {
                matrixHorizon[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixVertical = new int[width][depth];

        for (int i = 0; i < matrixVertical.length; i++) {
            for (int j = 0; j < matrixVertical[i].length; j++) {
                matrixVertical[i][j] = matrixHorizon[matrixHorizon.length - j - 1][i];
            }
        }
        for (int[] row : matrixVertical) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
/*
Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.

Input data format

Input the two numbers n and m, not exceeding 100, and then an array n×m in size.

Output data format

Output the resulting array. Separate numbers by a single space in the output.

Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34

Sample Output 1:

31 21 11
32 22 12
33 23 13
34 24 14
 */
/*
|-> Ready to run version <-|
        int[][] matrixHorizon = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };
        int[][] matrixVerti = new int[4][3];
        for (int i = 0; i < matrixVerti.length; i++) {
            for (int j = 0; j < matrixVerti[i].length; j++) {
                matrixVerti[i][j] = matrixHorizon[matrixHorizon.length - j - 1][i];
            }
        }
        for (int[] ints : matrixVerti) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
 */