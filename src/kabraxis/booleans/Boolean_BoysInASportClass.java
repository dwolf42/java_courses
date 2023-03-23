package kabraxis.booleans;

import java.util.Scanner;

public class Boolean_BoysInASportClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean order = h1 >= h2 && h2 >= h3 && h3 <= h1;
        boolean order2 = h1 <= h2 && h2 <= h3 && h3 >= h1;

        System.out.println(order || order2);
    }
}

/*
Suppose there are three boys in a sports class.

You need to write a program that checks the boys are arranged in the ascending or descending order by height. The program must read three integer numbers h1, h2, h3 and outputs true or false. If boys have the same height, they are considered as correctly arranged.

Sample Input 1:
165 161 158

Sample Output 1:
true

Sample Input 2:
155 165 160

Sample Output 2:
false

Sample Input 3:
161 161 165

Sample Output 3:
true
*/
