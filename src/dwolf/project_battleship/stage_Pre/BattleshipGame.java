package dwolf.project_battleship.stage_Pre;

import java.util.Arrays;
import java.util.Scanner;

class BattleshipGame {
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

    BattleshipGame() {
        gameMap = new char[10][10];

        for (char[] location : gameMap) {
            Arrays.fill(location, '~');
        }
    }

    public void run() {
        MapHandler.printMap(gameMap);
        int[] shipFrontTalePositions = obtainValidShipFrontTailPositionsArray();
        gameMap = MapHandler.updateMap(gameMap, shipFrontTalePositions);
        MapHandler.printMap(gameMap);
        int[] arr = {4, 4};
        MapHandler.updateMap(gameMap, arr, 'M');
        MapHandler.printMap(gameMap);
    }

    /**
     * Prompts the user for the coordinates on which they want to place the front and tail for a ship.
     *
     * @return the valid index coordinate pairs of a ship's front and tail
     */
    private int[] obtainValidShipFrontTailPositionsArray() {
        // Restricting other inputs then letters A to J, 1x whitespace and numbers 1 to 10 prevents coordinates
        // which are outside the game map
        final String VALID_ALPHANUM_INPUT = "^[A-J](10|[1-9])\\s[A-J](10|[1-9])$";
        boolean isValidInput = false;
        Scanner scanner = new Scanner(System.in);
        String userInput = " ";

        // Splitting allows easier translation of user input to array indexes, as processing the whole string
        // would require checks if the number part of the input has n or n + 1 digits.
        //  0  1   2  3 <- indexes
        // [B][10][D][10] <- example user input
        String[] splitUserInput;

        // Alphanumeric user input must be translated to array indexes for ship placement in a 2D-array
        int[] validShipFrontTailPositionsArray = new int[4];

        while (!isValidInput) {
            userInput = scanner.nextLine();
            userInput = userInput.toUpperCase();

            if (userInput.matches(VALID_ALPHANUM_INPUT)) {
                splitUserInput = userInput.split(" ");

                 /*
                 The decimal representations of the letters A to J are the numbers 65 to 74.
                 Subtracting the number 65 from each of these results in the indexes i = 0 to 9 in a 2D-array.
                 Within the same array, the numbers 1 to 10 correspond to the indexes j = 0 to 9.
                 Thus, the number 1 must be subtracted from the parsed number in each case.
                 */
                for (int i = 0; i < splitUserInput.length; i++) {
                    validShipFrontTailPositionsArray[i * 2] = (int) splitUserInput[i].charAt(0) - 65;
                    validShipFrontTailPositionsArray[i * 2 + 1] = Integer.parseInt(
                            splitUserInput[i].substring(1)) - 1;
                }

                // Valid ship placement is only horizontal or vertical on the game map
                if (
                        (validShipFrontTailPositionsArray[0] == validShipFrontTailPositionsArray[2]) ^
                                (validShipFrontTailPositionsArray[1] == validShipFrontTailPositionsArray[3])
                ) {

                    isValidInput = true;
                    continue;
                }
            }
            System.out.println("Error, please only enter coordinates according to the game map.");
        }

        return validShipFrontTailPositionsArray;
    }

}

