import java.util.Scanner; // imports scanner utility

public class ForLoop_FizzBuzz { // opens class
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner

        int start = scanner.nextInt(); // set first value, starting point
        int end = scanner.nextInt();  // set second value, ending point

        for (int i = start; i <= end; i++) { // opens for-loop

            if (i % 3 == 0 && i % 5 == 0) { // FizzBuzz check
                System.out.println("FizzBuzz");
            } // closes if-statement
            else if (i % 3 == 0) { // Fizz check
                System.out.println("Fizz");
            } // closes if-statement
            else if (i % 5 == 0) { // Buzz check
                System.out.println("Buzz");
            } // closes if-statement
            else { // print just the number
                System.out.println(i);
            } // closes if-statment

            scanner.close(); // closes scanner

        } // closes for loop

    } // closes method
} // closes class


/*
Fizz Buzz is a classic programming problem. Here is its slightly modified version.
Write a program that takes the input of two integers: the beginning and the end of the interval (both numbers belong to the interval).

The program should output the numbers from this interval, but if the number is divisible by 3,
you should output Fizz instead of it; if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5,
output FizzBuzz.

Output each number or the word on a separate line.

Sample Input 1:
8 16

Sample Output 1:
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16

*/