import java.util.Scanner;

public class IfAndScanner_IfNumberIsPositive {
    public static void main(String[] args) {
        System.out.println(answerer());
    }

    public static String answerer() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

/*
Returns true if the number is positive.
Zero is not a positive number.
*/