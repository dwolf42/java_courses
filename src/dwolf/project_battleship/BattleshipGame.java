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
        promptAndValidateCoords();
    }

    private int[] promptAndValidateCoords() {
        final String COORDS_REGEX = "^[A-Ja-j](10|[1-9])\\s[A-Ja-j](10|[1-9])$";
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        while (!userInput.matches(COORDS_REGEX)) {
            System.out.println("Error, please only enter coordinates according to the game map.");
            userInput = scanner.nextLine();
        }

        // Capital letters reduces overhead
        userInput = userInput.toUpperCase();

        // Alphanumeric user input must be translated to array indexes, so the ship parts can be placed on the game map
        int[] arrayIndexesOfUserInput = new int[4];
        String[] splitUserInput = userInput.split(" ");

        /*
        The decimal representations of the letters A to J are the numbers 65 to 74.
        Subtracting the number 65 from each of these results in the indexes i = 0 to 9 in a two-dimensional array.
        Within the same array, the numbers 1 to 10 correspond to the indexes j = 0 to 9.
        Thus, the number 1 must be subtracted from the parsed number in each case.
        */
        for (int i = 0; i < splitUserInput.length; i++) {
            arrayIndexesOfUserInput[i * 2] = (int) splitUserInput[i].charAt(0) - 65;
            arrayIndexesOfUserInput[i * 2 + 1] = Integer.parseInt(splitUserInput[i].substring(1)) - 1;
        }

        return arrayIndexesOfUserInput;
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
