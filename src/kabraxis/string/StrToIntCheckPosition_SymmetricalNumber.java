package kabraxis.string;

import java.util.Scanner;

public class StrToIntCheckPosition_SymmetricalNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 2002
        String str1 = Integer.toString(n); // transform int to String

        if (str1.charAt(0) == str1.charAt(str1.length() - 1) && str1.charAt(1) == str1.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}



/*
Given a four-digit number. Determine whether its decimal notation is symmetric.
If the number is symmetric, output 1; otherwise output any other integer.
The number may have less than four digits; in this case you should assume that its decimal notation is complemented by
insignificant zeros on the left.

Sample Input 1:
2002

Sample Output 1:
1

Sample Input 2:
2008

Sample Output 2:
37
*/