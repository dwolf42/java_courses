package dwolf.math_library;

import java.util.Scanner;

public class AngleBetweenVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double u1 = scanner.nextDouble();
        double u2 = scanner.nextDouble();

        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();

        double dotProduct = u1 * v1 + u2 * v2;
        double magnitudeU = Math.sqrt(Math.pow(u1, 2) + Math.pow(u2, 2));
        double magnitudeV = Math.sqrt(Math.pow(v1, 2) + Math.pow(v2, 2));
        double radians = Math.acos(dotProduct / (magnitudeU * magnitudeV));
        int degrees = (int)(Math.toDegrees(radians));
        System.out.println(degrees);
    }
}
