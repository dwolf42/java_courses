package com.github.kabraxis.loops.do_while_loop;

import java.util.Scanner;

public class DoWhileLoop_smallestFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1L;
        long o = 1L;
        do {
            o++;
            n *= o;
        } while (n < m);
        System.out.println(o);
    }
}
/*
The smallest value
A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.

n!, or factorial n, is a product of all natural numbers from 1 to n inclusive: for example, 5! = 1 * 2 * 3 * 4 * 5.

Just in case: wiki on factorials.

For example, the user enters 100. This means m = 100 and n = 5 because 5! = 120 (see the factorial formula) and this is the smallest number that satisfies the condition n! > m.

Pay attention that the user may input a really big number so choose an appropriate data type!


Sample Input:
6188989133

Sample Output:
13


Sample Input:
6

Sample Output:
4

*/