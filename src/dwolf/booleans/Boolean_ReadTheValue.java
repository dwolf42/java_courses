package dwolf.booleans;

import java.util.Scanner;

public class Boolean_ReadTheValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        boolean check = value < 10 && value > 0;

        System.out.println(check);

    }
}

/*
Write a program that reads a value and checks if it is less than 10 and greater than 0.

The result is a boolean value (true or false).

Sample Input 1:
0

Sample Output 1:
false
*/
