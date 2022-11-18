package com.github.kabraxis.loops.for_loop;

import java.util.Scanner; // imports scanner utility

public class ForLoop_ArithmeticAverage { // opens class
    public static void main(String[] args) { // opens method

        Scanner scanner = new Scanner(System.in); // opens scanner

        double start = scanner.nextInt(); // set first value, starting point
        double end = scanner.nextInt();  // set second value, ending point

        double sumOfDivisors = 0; // add-up all valid divisors
        double countOfDivisors = 0; // count how many numbers are divisible

        for (double i = start; i <= end; i++) { // opens for-loop

            if (i % 3 == 0) { // since the question is to find numbers divisible by 3 you can check it with modulo if it's divisible
                sumOfDivisors += i; // if number is divisible than add the number to the sum of divisors
                countOfDivisors++; // here we count how often we found a number divisible by 3

            } // closes if-statement
        } // closes for loop

        double average = sumOfDivisors / countOfDivisors; // calculate the average
        System.out.println(average); // prints result

        scanner.close(); // closes scanner
    } // closes method

} // closes class

/*
read two values from keyboard = scan two numbers.
These values mark the first and the last number for the calculation.
Program should print the average of all numbers of the defined range (start and end value) that are divisible by 3.
This means for the range of -5 to 12, there are 6 numbers divisible by 3, those are: -3, 0, 3, 6, 9, 12
Count the numbers divisible by 3.
Now all those pretty numbers have to be added together like this: -3 + 0 + 3 + 6 + 9 + 12 = 27
Than divide the value 27 by 6 to get the average of 4.5
Print the average!

xxxxxx

Write a program that reads two numbers a and b from the keyboard and calculates and outputs to the console the arithmetic
average of all numbers from the interval [a;b], which are divisible by 3.

In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12].
Total numbers divisible by 3 on this interval 6: -3, 0, 3, 6, 9, 12. Their arithmetic average equals to 4.5

The program input contains intervals, which always contain at least one number, which is divisible by 3.

Sample Input 1:
-5
12

Sample Output 1:
4.5

*/
