import java.util.Scanner;

public class TicTacToeStage5Of5 {

    static String hostName = "Host: ";
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        printWelcomeMessage();

        char[][] board = {
                // 1,1   1,2  1,3
                // 0,0   0,1  0,2
                {'_', '_', '_'},
                // 2,1   2,2  2,3
                // 1,0   1,1  1,2
                {'_', '_', '_'},
                // 3,1   3,2  3,3
                // 2,0   2,1  2,2
                {'_', '_', '_'},
        };

        printArrayBoard(board);
        printTurnMessage();
        int[] validateCoordinates = getValidCoordinates(board);

        // Coordinates provided by the user start counting form 1-3,
        // while the counting in arrays start fom 0-2.
        // So, the position on the board where the user wants to place their symbol has to be
        // the user's entered coordinate - 1, like: input = 1 1 -> position = 0 0 on the board.
        // That's why I subtract 1 in the final coordinates here.
        board[validCoordinates[0] - 1][validCoordinates[1] - 1] = currentPlayer;

        char winner = checkWinconditions(board);

        changePlayer();


        printArrayBoard(board);


    }

    public static void printWelcomeMessage() {
        System.out.println(hostName + "Welcome players to TicTacToe!");
        System.out.println(hostName + "Player 1 will be playing as X, player 2 will be playing as O.");
        System.out.println(hostName + "Have fun :)\n");
    }

    public static void printArrayBoard(char[][] board) {
        String horizontalBorder = "---------";
        String verticalBar = "|";

        System.out.println(horizontalBorder);
        for (char[] ch : board) {
            System.out.print(verticalBar + " ");
            for (char cha : ch) {
                System.out.print(cha + " ");
            }
            System.out.println(verticalBar);
        }
        System.out.println(horizontalBorder);
    }

    // User's input of coordinates is a string that will be checked if it contains
    // numbers and then the numbers will be translated to integers.
    // Keeps asking for the correct input.
    public static int[] getValidCoordinates(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        // Only positive numbers are allowed.
        String pattern = "([-+])?\\d+";
        System.out.println("Enter the coordinates: ");
        String[] coordinates = scanner.nextLine().split(" ");

        // Loops as long as the input doesn't match the pattern of only positive integers.
        if (!coordinates[0].matches(pattern) || !coordinates[1].matches(pattern)) {
            System.out.println("You should enter numbers!");
            return getValidCoordinates(board);
        }

        // Translates string numbers to integers.
        int[] numCoordinates = {Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])};

        // In case the user enters coordinates bigger than 3 or smaller than 0 an error will be shown and
        // the method will be reset and restarted.
        if (numCoordinates[0] > 3 || numCoordinates[0] < 1 || numCoordinates[1] > 3 || numCoordinates[1] < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return getValidCoordinates(board);
        }

        // When user input is in range and a number, this checks whether it's valid or not.
        if (!isValidTurn(board, numCoordinates)) {
            return getValidCoordinates(board);
        }

        return numCoordinates;
    }

    // Coordinates provided by the user start counting from 1-3,
    // while the counting in arrays start from 0-2.
    // So the position on the board where the user wants to place their symbol has to be
    // the user's entered coordinate - 1, like: input = 1 1 -> position = 0 0 on the board.
    // That's why I subtract 1 in the if-condition here.
    public static boolean isValidTurn(char[][] board, int[] getValidCoordinates) {
        if (board[getValidCoordinates[0] - 1][getValidCoordinates[1] - 1] == '_') {
            return true;
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
    }

    public static void printTurnMessage() {
        System.out.println(hostName + currentPlayer + "Enter the coordinates:");
    }

    public static void changePlayer() {
        switch (currentPlayer) {
            case 'X':
                currentPlayer = 'O';
                break;
            default:
                currentPlayer = 'X';
                break;
        }
    }

    public static char checkWinconditions(char[][] board) {
         /* Iterate through board to determine:

         * -> O wins: three O's in a row
         * -> X wins: three X's in a row
         * -> Draw: neither side wins, no more empty cells
         * */

        // --- Win conditions ---

        // >>> X win conditions <<<

        // True if the indexes that are building the diagonal line from top left to bottom right
        // or from top right to bottom left are "X"

        boolean xWinLeftDiagonal = board[0][0] == ('X') &&
                board[1][1] == ('X') &&
                board[2][2] == ('X');

        boolean xWinRightDiagonal = board[0][2] == ('X') &&
                board[1][1] == ('X') &&
                board[2][0] == ('X');

        // True if the indexes that are building horizontal lines left to right are "X'
        boolean xWinHorizontal1 = board[0][0] == ('X') &&
                board[0][1] == ('X') &&
                board[0][2] == ('X');

        boolean xWinHorizontal2 = board[1][0] == ('X') &&
                board[1][1] == ('X') &&
                board[1][2] == ('X');

        boolean xWinHorizontal3 = board[2][0] == ('X') &&
                board[2][1] == ('X') &&
                board[2][2] == ('X');

        // True if the indexes that are building vertical lines top to bottom are "X"
        boolean xWinVertical1 = board[0][0] == ('X') &&
                board[1][0] == ('X') &&
                board[2][0] == ('X');

        boolean xWinVertical2 = board[0][1] == ('X') &&
                board[1][1] == ('X') &&
                board[2][1] == ('X');

        boolean xWinVertical3 = board[0][2] == ('X') &&
                board[1][2] == ('X') &&
                board[2][2] == ('X');


        // >>> O win conditions <<<

        // True if the indexes that are building the diagonal line from top left to bottom right
        // or from top right to bottom left are "O"
        boolean oWinLeftDiagonal = board[0][0] == ('O') &&
                board[1][1] == ('O') &&
                board[2][2] == ('O');

        boolean oWinRightDiagonal = board[0][2] == ('O') &&
                board[1][1] == ('O') &&
                board[2][0] == ('O');

        // True if the indexes that are building horizontal lines left to right are "O"
        boolean oWinHorizontal1 = board[0][0] == ('O') &&
                board[0][1] == ('O') &&
                board[0][2] == ('O');

        boolean oWinHorizontal2 = board[1][0] == ('O') &&
                board[1][1] == ('O') &&
                board[1][2] == ('O');

        boolean oWinHorizontal3 = board[2][0] == ('O') &&
                board[2][1] == ('O') &&
                board[2][2] == ('O');

        // True if the indexes that are building vertical lines top to bottom are "O"
        boolean oWinVertical1 = board[0][0] == ('O') &&
                board[1][0] == ('O') &&
                board[2][0] == ('O');

        boolean oWinVertical2 = board[0][1] == ('O') &&
                board[1][1] == ('O') &&
                board[2][1] == ('O');

        boolean oWinVertical3 = board[0][2] == ('O') &&
                board[1][2] == ('O') &&
                board[2][2] == ('O');


        if (xWinLeftDiagonal || xWinRightDiagonal ||
            xWinHorizontal1 || xWinHorizontal2 ||
            xWinHorizontal3 || xWinVertical1 ||
            xWinVertical2 || xWinVertical3) {

            return 'X';
        }

        if (oWinLeftDiagonal || oWinRightDiagonal ||
                oWinHorizontal1 || oWinHorizontal2 ||
                oWinHorizontal3 || oWinVertical1 ||
                oWinVertical2 || oWinVertical3) {
            return 'O';
        }

        // --- Draw condition ---
        int X = 0;
        int O = 0;

        for (char[] c : board) {
            for (char ch : c) {
                if (ch == 'X') {
                    X++;
                } else if (ch == 'O') {
                    O++;
                }
            }
        }
        if (X + O == 9) {
            return 'd';
        }

        // --- Game goes on condition ---
        return '_';
    }


}

/*
Stage 5/5: Fight!
        Description
        Our game is almost ready! Now let's combine what we’ve learned in the previous stages to make a game of tic-tac-toe that two players can play from the beginning (with an empty grid) through to the end (until there is a draw, or one of the players wins).

        The first player has to play as X and their opponent plays as O.

        Objectives
        In this stage, you should write a program that:

        Prints an empty grid at the beginning of the game.
        Creates a game loop where the program asks the user to enter the cell coordinates, analyzes the move for correctness and shows a grid with the changes if everything is okay.
        Ends the game when someone wins or there is a draw.
        You need to output the final result at the end of the game.

        Good luck!

        The project was changed. Now the coordinates start from the upper left corner. Look closely at the examples.
        Example
        The example below shows how your program should work.
        Notice that after Enter the coordinates: comes the user input.

        ---------
        |       |
        |       |
        |       |
        ---------
        Enter the coordinates: 2 2
        ---------
        |       |
        |   X   |
        |       |
        ---------
        Enter the coordinates: 2 2
        This cell is occupied! Choose another one!
        Enter the coordinates: two two
        You should enter numbers!
        Enter the coordinates: 1 4
        Coordinates should be from 1 to 3!
        Enter the coordinates: 1 1
        ---------
        | O     |
        |   X   |
        |       |
        ---------
        Enter the coordinates: 3 3
        ---------
        | O     |
        |   X   |
        |     X |
        ---------
        Enter the coordinates: 2 1
        ---------
        | O     |
        | O X   |
        |     X |
        ---------
        Enter the coordinates: 3 1
        ---------
        | O     |
        | O X   |
        | X   X |
        ---------
        Enter the coordinates: 2 3
        ---------
        | O     |
        | O X O |
        | X   X |
        ---------
        Enter the coordinates: 3 2
        ---------
        | O     |
        | O X O |
        | X X X |
        ---------
        X wins
*/