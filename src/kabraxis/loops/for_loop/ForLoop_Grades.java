package kabraxis.loops.for_loop;

import java.util.Scanner; // imports scanner utility

public class ForLoop_Grades { // opens class
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner

        int start = scanner.nextInt(); // iterations
        int a = 0;  // getting value
        int b = 0;  // getting value
        int c = 0;  // getting value
        int d = 0;  // getting value

        for (int i = 0; i < start; i++) { // opens for-loop

            int input = scanner.nextInt();

            if (input == 5) {
                a++;
            } // closes if-statement
            else if (input == 4) {
                b++;
            } // closes if-statement
            else if (input == 3) {
                c++;
            } // closes if-statement
            else if (input == 2) {
                d++;
            } // closes if-statement
        } // closes for loop

        System.out.println(d + " " + c + " " + b + " " + a); // prints result
        scanner.close(); // closes scanner

    } // closes method
} // closes class


/*

Find the number of D, C, B and A grades for the last test on informatics,
where n students from a class have successfully passed the test.

In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5.
They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D.
The program gets number n as input and then gets the grades themselves: one by one.

The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.

Sample Input 1:
13
2
5
5
5
5
3
2
4
3
3
3
2
3

Sample Output 1:
3 5 1 4

*/