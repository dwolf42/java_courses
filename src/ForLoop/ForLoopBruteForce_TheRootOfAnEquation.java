package ForLoop;

import java.util.Scanner; // imports scanner utility

public class ForLoopBruteForce_TheRootOfAnEquation {
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner

        int a = scanner.nextInt(); // getting input
        int b = scanner.nextInt(); // getting input
        int c = scanner.nextInt(); // getting input
        int d = scanner.nextInt(); // getting input

        for (int i = 0; i <= 1000; i++) { // opens for-loop

            if (a * i * i * i + b * i * i + c * i + d == 0) { // brute force the hell out if it :D

                System.out.println(i); // prints result

            } // closes if-statement

        } // closes for loop

        scanner.close(); // closes scanner

    }  // closes method

} // closes class


/*
The roots of a cubic equation

Given the numbers a, b, c, d.
Output in ascending order all the integers between 0 and 1000 which are the roots of the equation ax^3 + bx^2 + cx + d = 0.

If the specified interval does not contain the roots of the equation, do not output anything.

Remember, that cubic equation always has 3 roots. Keep it in mind in order to optimize the code.

Sample Input 1:
-1
1
-1
1

Sample Output 1:
1

Sample Input 2:
0
1
-6
5

Sample Output 2:
1
5

*/