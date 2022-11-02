package com.github.kabraxis.methods;

public class Method_Experiment02 {
    public static void main(String[] args) {
        // I can either set a new variable and initialize it by a call of the desired method, containing the desired values (parameters)
        // and print it by passing the new variable to the print method
        int squaremeters = getSquaremeters(5, 2);
        printResult(squaremeters);

        // or I can just pass the method itself, containing the values to be calculated directly to the print method
        printResult(getSquaremeters(3, 3));
    }

    public static int getSquaremeters(int a, int b) {
        return a * b;
    }

    public static void printResult(int square) {
        System.out.println(square);
    }
}
// Yet another method experiment in order to get used to methods