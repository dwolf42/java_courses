package com.github.kabraxis.booleans;

import java.util.Scanner;

public class Boolean_CheckBurgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        boolean n1 = n.contains("burg");

        System.out.println(n1);
    }
}

/*
Write a program that reads the name of a city and check the name ends with "burg".
Keep in mind, a city can have a short name.
The program should output true or false.

Sample Input 1:
Brandenburg

Sample Output 1:
true

Sample Input 2:
Saint Petersburg

Sample Output 2:
true

Sample Input 3:
Tu

Sample Output 3:
false
*/
