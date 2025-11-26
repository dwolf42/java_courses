package dwolf.project_battleship.stage_Pre;

/**
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

class MapHandler {
    static void printMap(char[][] gameMap) {
        // User will see the numbers 1 to 10 above game board for column enumeration
        // Of course this could be represented using a string, but also missing all the fun
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print(
                    (i == 0 ? "  " : " ") // Aligns the numbers to the columns
                            + (i + 1));
        }
        System.out.println();

        // User will see the characters A to J left side of game board for row enumeration
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

    static char[][] updateMap(char[][] gameMap, int[] coords) {
        int start;
        int end;

        if (coords[0] == coords[2]) {
            // Vertical placing
            start = Math.min(coords[1], coords[3]);
            end = Math.max(coords[1], coords[3]);
            for (int i = start; i <= end; i++) {
                gameMap[coords[0]][i] = 'O';
            }
        } else {
            // Horizontal placing
            start = Math.min(coords[0], coords[2]);
            end = Math.max(coords[0], coords[2]);
            for (int i = start; i <= end; i++) {
                gameMap[i][coords[1]] = 'O';
            }
        }

        return gameMap;
    }

    static char[][] updateMap(char[][] gameMap, int[] coords, char symbol) {
        gameMap[coords[0]][coords[1]] = symbol;
        return gameMap;
    }
}