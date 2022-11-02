package com.github.kabraxis.array;

public class Array_PrintLengthRowsAndColumnsOfArray {
    public static void main(String[] args) {
        int[][] c = {
                {40, 30, 25, 30, 15},
                {13, 12, 16},
                {101, 125, 114, 131}
        };
        System.out.print(c.length + " "); // prints how many rows the 2d array has

        for (int[] nestedArray : c) {
            System.out.print(nestedArray.length + " "); // prints how many columns the array has - since we print only the 1d array parts of the array.
        }
    }
}