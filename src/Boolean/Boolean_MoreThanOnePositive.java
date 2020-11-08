package Boolean;

import java.util.Scanner;

public class Boolean_MoreThanOnePositive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a > 0) || (b > 0) || (c > 0));
    }
}

/*
Returns true if more than one number is positive, otherwise returns false
*/