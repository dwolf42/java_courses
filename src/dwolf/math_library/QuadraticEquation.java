package dwolf.math_library;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                calcRoots(a, b, c);
                break;

            } catch (Exception e) {
                System.out.println("Invalid input. Please only enter numbers:");
                scanner.next();
            }
        }
        scanner.close();
    }

    // standard form of a quadratic equation is:
    // ax² + bx + c = 0
    public static void calcRoots(double a, double b, double c) {
        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double root1 = (-b + sqrt) / (2 * a);
        double root2 = (-b - sqrt) / (2 * a);
        printRoots(root1, root2);
    }

    public static void printRoots(double root1, double root2) {
        if (root1 > root2) {
            System.out.println(root2);
            System.out.println(root1);
        } else {
            System.out.println(root1);
            System.out.println(root2);
        }
    }
}