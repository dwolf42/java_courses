/*
Implement a method that takes a String message as an argument. The method translates all letters having an even index
to uppercase (index 0 is considered even) and returns the result.

It's guaranteed that input strings will not be empty.

Sample Input 1:

computer
Sample Output 1:

CoMpUtEr
Sample Input 2:

programming
Sample Output 2:

PrOgRaMmInG
 */

package dwolf.string.stringbuilder;

import java.util.Scanner;

public class StringBuilder_BigLetters {
    public static String upperEvenLetters(String message) {
        StringBuilder evenIndexUppercase = new StringBuilder(message);
        for (int i = 0; i < evenIndexUppercase.length(); i++) {
            if (i % 2 == 0) {
                evenIndexUppercase.setCharAt(i, Character.toUpperCase(evenIndexUppercase.charAt(i)));
            }
        }
        return evenIndexUppercase.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}
