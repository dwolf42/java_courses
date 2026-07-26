import java.util.Scanner;
import java.util.Arrays;

public class Battleship {
    public Battleship() {
        System.out.print(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();

        char rowLetter = 'A';

        for (int i = 0; i <= 9; i++) {
            System.out.print(rowLetter);
            for (int j = 0; j <= 9; j++) {
                System.out.print(" " + "~"); 
            }
            System.out.println();
            rowLetter++;
        }

        System.out.println("Enter the coordinates of the ship:");
        String usrInput = " "; 
        Scanner scanner = new Scanner(System.in);
        usrInput = scanner.nextLine().toUpperCase();
        String[] inputParts = usrInput.split(" ");

        // The ASCII character code (int representation) for 'A' is 65
        // The first index of an array is 0.
        // Subtracting 65 from the int rep. will result in the correct index.
        int x1 = (int) inputParts[0].charAt(0) - 65;
        String y1Part = inputParts[0].substring(1);
        int y1 = Integer.parseInt(y1Part) - 1;

        int x2 = (int) inputParts[1].charAt(0) - 65;
        String y2Part = inputParts[1].substring(1);
        int y2 = Integer.parseInt(y2Part) - 1;

        boolean isX1InBoundries = x1 >= 0 && x1 <=9;
        boolean isY1InBoundries = y1 >= 0 && y1 <=9;

        boolean isX2InBoundries = x2 >= 0 && x2 <=9;
        boolean isY2InBoundries = y2 >= 0 && y2 <=9;

        boolean isHoriOrVerti = x1 == x2 || y1 == y2;


        System.out.println("x1: " + x1);
        System.out.println("y1: " + y1);
        System.out.println("x2: " + x2);
        System.out.println("y2: " + y2);

        System.out.println("isX1InBoundries: " + isX1InBoundries);
        System.out.println("isY1InBoundries: " + isY1InBoundries);
        System.out.println("isX2InBoundries: " + isX2InBoundries);
        System.out.println("isY2InBoundries: " + isY2InBoundries);
        System.out.println("isHoriOrVerti: " + isHoriOrVerti);

        if (!isX1InBoundries || !isY1InBoundries ||
                !isY1InBoundries || !isY2InBoundries || !isHoriOrVerti) {
            System.out.println("Error");
                }
        /*
         *
         *       //////////////////// Example Game Map //////////////////
         *       ~ water
         *       M miss
         *       O ship
         *       X hit
         *            1  2  3  4  5  6  7  8  9  10
         *            0  1  2  3  4  5  6  7  8  9
         *       A 0  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
         *       B 1  ~  M  ~  M  ~  ~  O  ~  ~  ~
         *       C 2  ~  ~  M  ~  ~  ~  O  ~  ~  ~
         *       D 3  ~  ~  ~  M  ~  ~  O  ~  ~  ~
         *       E 4  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
         *       F 5  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
         *       G 6  ~  ~  O  O  X  O  O  ~  ~  ~
         *       H 7  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
         *       I 8  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
         *       J 9  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
         */

    }

    public static void main(String[] args) {
        new Battleship();
    }

}
