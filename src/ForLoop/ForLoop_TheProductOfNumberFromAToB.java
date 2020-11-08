package ForLoop;

import java.util.Scanner;

public class ForLoop_TheProductOfNumberFromAToB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        long accumulator = 1;

        for (int i = start; i < end; i++) {
            accumulator *= i;
            System.out.println("i is at: " + i);
            System.out.println("accumulator is at: " + accumulator);
            System.out.println();
        }

        System.out.println(accumulator);
    }

}

/*
Write a program that prints the product of all integer numbers from a to b (a < b).
Include a and exclude b from the product.

Sample Input 1:
1 2

Sample Output 1:
1

Sample Input 2:
100 105

Sample Output 2:
11035502400
*/