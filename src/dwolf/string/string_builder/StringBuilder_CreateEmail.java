/*
We need to create an email name for an employee. For this, implement a method that takes a String name and a String
surname as an argument. The method should concatenate the name, the surname, and at the end, add the domain "@work.net".
Return the result. It's guaranteed that input strings will not be empty.

Use StringBuilder to solve the problem.
 */

package dwolf.string.string_builder;

import java.util.Scanner;

public class StringBuilder_CreateEmail {
    public static String createEmail(String name, String surname) {
        StringBuilder email = new StringBuilder();
        email
                .append(name)
                .append(surname)
                .append("@work.net");

        // requirements are to return a string
        return email.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);
    }
}