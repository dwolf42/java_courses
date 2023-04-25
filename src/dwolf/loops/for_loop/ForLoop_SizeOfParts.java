package dwolf.loops.for_loop;

import java.util.Scanner;

public class ForLoop_SizeOfParts {
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner


        int n = scanner.nextInt(); // getting the amount of parts aka. amount of times the loop will have to run.

        int perfect = 0; // counting the amount of parts from each Category.
        int tooBig = 0; // counting the amount of parts from each Category.
        int tooShort = 0; // counting the amount of parts from each Category.

        for (int i = 0; i < n; i++) { // opens for-loop, also the amount of parts is inserted here.

            int lengths = scanner.nextInt(); // getting the lengths of each part

            if (lengths == 0) {
                perfect++;

            } else if (lengths > 0) {
                tooBig++;

            } else if (lengths < 0) {
                tooShort++;
            }
        } // closes for loop

        System.out.println(perfect + " " + tooBig + " " + tooShort); // prints result

        scanner.close(); // closes scanner
    } // closes method

} // closes class


/*
A detector compares the size of parts produced by a machine with the reference standard.

If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.

Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
The program should output numbers in a single line containing the number of parts ready to be shipped,
the number of parts to be fixed, and the number of rejects.

Sample Input 1:

14
0
-1
-1
1
0
0
0
0
0
1
0
-1
1
-1

Sample Output 1:
7 (perfect) 3 (big) 4 (small)

*/