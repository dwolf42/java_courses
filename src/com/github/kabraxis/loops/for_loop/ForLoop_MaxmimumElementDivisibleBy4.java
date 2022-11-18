package com.github.kabraxis.loops.for_loop;

import java.util.Scanner; // imports scanner utility

public class ForLoop_MaxmimumElementDivisibleBy4 { // opens class
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner
        int numberOfElements = scanner.nextInt(); // getting the number of elements aka. interations of the for-loop
        int biggest = 0; // assigning the biggest element divisible by 4

        for (int i = 0; i < numberOfElements; i++) { // opens for-loop
            int elements = scanner.nextInt(); // getting the elements used to check if divisible by 4

            if (elements % 4 == 0) { // since the question is to find the biggest element divisible by 4 you can check it with modulo if it's divisible
                if (elements > biggest) { // opens nested if-statement, also checks if the element that is divisible by 4 is bigger then the currently biggest
                    biggest = elements; // assigning the new biggest element to the position of biggest element

                } // closes nested if-statement

            } // closes if-statement
        } // closes for loop

        System.out.println(biggest); // prints result

        scanner.close(); // closes scanner
    } // closes method

} // closes class

/*
Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4. The program receives the number of elements in the sequence and then the elements themselves as input. In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000. The program should print a single number: the maximum element of the sequence divisible by 4.

Try to solve this problem by using a for-loop.

Sample Input 1:

12
16
87
58
25
73
86
36
79
40
12
89
32

Sample Output 1:
40

*/