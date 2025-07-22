package dwolf.project_battleship;

import java.util.Arrays;
import java.util.Scanner;

public class BattleshipGame {
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

    private char[][] gameMap;

    public BattleshipGame() {
        gameMap = new char[10][10];

        for (char[] location : gameMap) {
            Arrays.fill(location, '~');
        }
    }

    public void run() {
        printMap(gameMap);
        obtainCoords();
    }

    private int[] obtainCoords() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String castUpper = userInput.toUpperCase();

        int[] coords = new int[4];

        char letterPart = castUpper.charAt(0);
        int letterToInt = letterPart;
        coords[0] = letterToInt - 65;

        char numPart = userInput.charAt(1);
        coords[1] = Character.getNumericValue(numPart) - 1;

        letterPart = castUpper.charAt(3);
        letterToInt = letterPart;
        coords[2] = letterToInt - 65;

        numPart = userInput.charAt(4);
        coords[3] = Character.getNumericValue(numPart) - 1;

        return coords;
    }

    private void printMap(char[][] gameMap) {
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
