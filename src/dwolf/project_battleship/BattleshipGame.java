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
        scanAndFilterInput();
    }

    // TODO: refactor promptAndValidateCoords in two methods, one to prompt for input, one to validate it.
    // TODO: Currently, the coords only get checked for being inside the game map. Add diagonal check!
    // TODO: add method to calculate ship size
    // TODO: add method to extrapolate the coords in between user input coords: D5 ... D9

    // rename to filter

    private int[] scanAndFilterInput() {
        // Restricting other inputs then letters A to J, 1x whitespace and numbers 1 to 10 prevents coordinates
        // which are outside the game map
        final String VALID_ALPHANUM_INPUT = "^[A-J](10|[1-9])\\s[A-J](10|[1-9])$";

        boolean isValidInput = false;
        Scanner scanner = new Scanner(System.in);
        String userInput = " ";

        // Alphanumeric user input must be translated to array indexes for ship placement in a 2D-array
        int[] arrayIndexesOfUserInput = new int[4];

        // Allows easier translatioin of user input to array indexes
        //  0  1   2  3 <- indexes
        // [B][10][D][10] <- example user input
        String[] splitUserInput = {};

        while (!isValidInput) {
            // userInput = scanner.nextLine();
            userInput = "B10 C10";
            userInput = userInput.toUpperCase();

            if (userInput.matches(VALID_ALPHANUM_INPUT)) {
                splitUserInput = userInput.split(" ");

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
// check whether input is only horizontal or diagonal

                if (
                        (arrayIndexesOfUserInput[0] == arrayIndexesOfUserInput[2]) ^
                (arrayIndexesOfUserInput[1] == arrayIndexesOfUserInput[3])
                ){
                    isValidInput = true;
                }
            }
            System.out.println("Error, please only enter coordinates according to the game map.");

        }

        return arrayIndexesOfUserInput;
    }


    private void printMap(char[][] gameMap) {
        // User will see the numbers 1 to 10 above game board for column enumeration
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print((i == 0 ? "  " : " ") + (i + 1));
        }
        System.out.println();

        // User will see the characters A to J left of game board for row enumeration
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


    private int calculateShipSize(int[] validCoords) {
        return 1;
    }

    // User input consists only of start/end coords of a ship, from which the coords of the ship parts in between must
// be extrapolated
    private int[] calculateBodyCoords() {
        return new int[1];
    }


}
/*     y 1    2    3
 * x A [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *   B [(~)][(~)][(~)][(~)][(~)][(~)][(O)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(O)][(X)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(O)][(M)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *
 *
 *
 *
 * */
