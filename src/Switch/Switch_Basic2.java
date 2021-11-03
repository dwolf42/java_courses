package Switch;

import java.util.Scanner;

public class Switch_Basic2 {
    public static void main(String[] args) {
        System.out.println(selectShape(readNum()));
    }

    public static int readNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String selectShape(int readNum) {
        String square = "You have chosen a square";
        String circle = "You have chosen a circle";
        String triangle = "You have chosen a triangle";
        String rhombus = "You have chosen a rhombus";
        String nope = "There is no such shape!";

        switch (readNum) {
            case 1:
                return square;
            case 2:
                return circle;
            case 3:
                return triangle;
            case 4:
                return rhombus;
            default:
                return nope;
        }
    }
}
/*
Shape
Write a program, which reads the number of the shape (1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number). If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".

Note: the output text should exactly match the sample, including letters' case and location of spaces.


Sample Input:
1

Sample Output:
You have chosen a square

*/