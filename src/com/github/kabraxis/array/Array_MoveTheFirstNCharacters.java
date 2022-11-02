package com.github.kabraxis.array;

import java.util.Scanner;

public class Array_MoveTheFirstNCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        String[] oldArray = s.split("");

        if (n == oldArray.length || n == 0 || n > oldArray.length) {
            System.out.println(s);
        } else {
            String[] newArray = new String[oldArray.length];

            // copy first n elements to the end of the new array
            for (int i = 0; i < n; i++) {
                newArray[oldArray.length - n + i] = oldArray[i];
            }
            // copy elements past n to the beginning of the new array
            for (int j = 0; j < oldArray.length - n; j++) {
                newArray[j] = oldArray[n + j];
            }
            // print the new array
            System.out.println(String.join("", newArray));
        }
    }
}


       /*

       ***My thought process***

        // copy the fist n elements to the end of the array
       (1) 2 3 4 5
        H  E L L O -> old[from 0 to n - 1]
        0  1 2 3 4
                 H -> new[from length - n + i]

        1 (2) 3 4 5
        H  E  L L O -> old[from 0 to n - 1]
        0  1  2 3 4
                H E -> new[length - n + i]

        1 2 (3) 4 5
        H E  L  L O -> old[from 0 to n - 1]
        0 1  2  3 4
             H  E L -> new[length:5 - n:3 = 2 + i:0 = 2]

        1 2 3 (4) 5
        H E L  L  O -> old[from 0 to n - 1]
        0 1 2  3  4
          H E  L  L
-------------------------------------------------
        // copy the elements past n to the beginning of the array
       (1) 2 3 4 5
        H  E L L O -> old[from n + j to < length]
        0  1 2 3 4
        E  L L O   -> new[j]

        1 (2) 3 4 5
        H  E  L L O -> old[from n + j to < length]
        0  1  2 3 4
        L  L  O     -> new[j]

        1 2 (3) 4 5
        H E  L  L O -> old[from n:3 + j:0 = 3 to < length] // old[n3 + j0 = 3L], old[n3 + j1 = 4O]
        0 1  2  3 4
        LO          -> new[j]

        1 2 3 (4) 5
        H E L  L  O -> old[from n + j to < length]
        0 1 2  3  4
        O           -> new[j]

        */
/*
Move the first N characters
Write a program that reads a string s and an int n, and then moves the first n characters of s to the end of the string. The program must output the changed string. If n is greater than the length of the string, it must output the string unchanged.

Note, the substring method can help you, but you may choose another way to solve the problem.

Input data format

The single input line contains s and n separated by a space.


Sample Input:
Hello 3

Sample Output:
loHel
*/