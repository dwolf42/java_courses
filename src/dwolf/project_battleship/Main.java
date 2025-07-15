package dwolf.project_battleship;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        // 65 = A => 0
        // 66 = B => 1
        // 67 = C => 2
        // 68 = D => 3
        // 69 = E => 4
        // 70 = F => 5
        // 71 = G => 6
        // 72 = H => 7
        // 73 = I => 8
        // 74 = J => 9

        char[][] gameMap = new char[10][10];

        for (char[] location : gameMap) {
            Arrays.fill(location, '~');
        }

        printMap(gameMap);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String castUpper = userInput.toUpperCase();

        char letterPart = castUpper.charAt(0);
        int letterToInt = letterPart;
        int row = letterToInt - 65;

        char numPart = userInput.charAt(1);
        int col = Character.getNumericValue(numPart) - 1;
        scanner.close();
        System.out.println(col);

    }

    private static void printMap(char[][] gameMap) {

        // Add numbers 1-10 above game board for column enumeration
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print((i == 0 ? "  " : " ") + (i + 1));
        }
        System.out.println();

        // Add characters A-J left of game board for row enumeration
        // Using numbers as incrementor instead of characters to utilize the array's length as limit
        char ch = 'A';
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print(ch + " ");
            ch++;
            for (int j = 0; j < gameMap[i].length; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}