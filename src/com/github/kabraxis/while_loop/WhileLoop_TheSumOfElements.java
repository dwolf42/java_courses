package com.github.kabraxis.while_loop;

import java.util.Scanner;

public class WhileLoop_TheSumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input = 1;

        while (input > 0) {
            input = scanner.nextInt();
            sum += input;
        }
        System.out.println(sum);
    }
}

/*
Find the sum of all elements of a sequence, ending with the number 0.

The number 0 itself is not included into the sequence and serves as a sign of cessation.

Sample Input 1:
3
6
8
0

Sample Output 1:
17

*/
