package dwolf.loops.for_loop;

import java.util.Scanner; // imports the Scanner utility

public class ForLoop_SumOfNumbersDivisibleBy6 {
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner

        int numberOfElements = scanner.nextInt(); // getting the number of elements aka. interations of the for-loop

        int sum = 0; // summing up the elements divisible by 6

        for (int i = 0; i < numberOfElements; i++) { // opens for-loop, also the amount of parts is inserted here.

            int elements = scanner.nextInt(); // getting the elements used to check if divisible by 6

            if (elements % 6 == 0) { // since the question is to find any element divisible by 6 you can chek it with modulo
                sum += elements; // takes the variable sum and adds the value of variable elements

            } // closes if-statement
        } // closes for loop

        System.out.println(sum); // prints result

        scanner.close(); // closes scanner
    } // closes method

} // closes class


/*
Given the sequence of natural numbers. Find the sum of numbers divisible by 6.
The input is the number of elements in the sequence, and then the elements themselves.
In this sequence, there is always a number divisible by 6.

Sample Input 1:

8
11
12
68
6
98
81
36
86

Sample Output 1:
54

*/