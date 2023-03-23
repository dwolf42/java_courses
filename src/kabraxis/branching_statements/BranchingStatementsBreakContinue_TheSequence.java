package kabraxis.branching_statements;

import java.util.Scanner;

public class BranchingStatementsBreakContinue_TheSequence {
    public static void main(String[] args) {
        sequence();
    }

    /* with branching */
    public static void sequence() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int prints = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (prints == number) {
                    break;
                }

                System.out.print(i + " ");
                prints++;
            }
            if (prints == number) {
                break;
            }
        }

    }

}


/* without branching
    public static void sequence() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int prints = 0;

        for (int i = 1; i <= number && prints != number; i++) {

            for (int j = 0; j < i && prints != number; j++) {

                System.out.print(i + " ");
                prints++;

            }

        }

    }
}

 */

/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
(the number is repeated as many times, to what it equals to).
The input to the program is a positive integer n: the number of the elements of the sequence the program should print.
Output the sequence of numbers, written in a single line, space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.

Sample Input 1:

7
Sample Output 1:

1 2 2 3 3 3 4
*/