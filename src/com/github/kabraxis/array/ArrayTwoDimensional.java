package com.github.kabraxis.array;

import java.util.Random;

public class ArrayTwoDimensional {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] array2 = new int[3][4];

        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                array2[row][column] = rand.nextInt(100);
            }
        }

        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                System.out.print(array2[row][column] + " ");
            }
            System.out.println();
        }
    }

}
