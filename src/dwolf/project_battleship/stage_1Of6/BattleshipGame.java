package dwolf.project_battleship.stage_1Of6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BattleshipGame {
    char[][] gameMap;
    Coords userCoords;
    public BattleshipGame() {
        gameMap = new char[10][10];
        for (char[] location : gameMap) {
            Arrays.fill(location, '~');
        }
    }

    public void run() {
        printMap();
        userCoords = new Coords(askCoordsString());
        System.out.println(userCoords.getAllPositions());
    }


    public String askCoordsString() {
        // Restricting other inputs then letters A to J, 1x whitespace and numbers 1 to 10 prevents coordinates
        // which are outside the game map
        final String validCoordsPattern = "^[A-J](10|[1-9])\\s[A-J](10|[1-9])$";
        Pattern pattern = Pattern.compile(validCoordsPattern);
        Matcher matcher;
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter the coordinates of the ship:");
        input = scanner.nextLine().toUpperCase();
        matcher = pattern.matcher(input);
        while (!matcher.matches()) {
            System.out.println("Error!");
            input = scanner.nextLine().toUpperCase();
            matcher = pattern.matcher(input);
        }
        return input;
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
    public void printMap() {
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
}

