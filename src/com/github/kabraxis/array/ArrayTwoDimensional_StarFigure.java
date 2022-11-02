package com.github.kabraxis.array;

import java.util.Scanner;

public class ArrayTwoDimensional_StarFigure {
    public static void main(String[] args) {
        Scanner luvos = new Scanner(System.in);
        int n = luvos.nextInt();
        char[][] figure = new char[n][n];

        for (int i = 0; i < figure.length; i++) {
            for (int j = 0; j < figure.length; j++) {
                if (i == j /*left diagonal*/ ||
                        j == (figure.length - 1) / 2 /*vertical*/ ||
                        j == figure.length - 1 - i /*right diagonal*/ ||
                        i == (figure.length - 1) / 2 /*horizontal*/) {
                    figure[i][j] = '*';
                } else {
                    figure[i][j] = '.';
                }
            }
        }

        for (char[] chars : figure) {
            for (char anChar : chars) {
                System.out.print(anChar + " ");
            }
            System.out.println("");
        }
    }
}
/*
    Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements,
    by filling it with "." symbols (each element of the matrix is a string containing a single symbol).
    Then fill the middle row of the matrix, the middle column, and the main and the secondary diagonals
    with the "*" symbols. As a result, all "*"s in the array must form the star figure. Output this matrix;
    elements of the array should be space separated.

        Sample Input 1:
        9

        Sample Output 1:
        * . . . * . . . *
        . * . . * . . * .
        . . * . * . * . .
        . . . * * * . . .
        * * * * * * * * *
        . . . * * * . . .
        . . * . * . * . .
        . * . . * . . * .
        * . . . * . . . *
 */