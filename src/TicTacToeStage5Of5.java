import java.util.Scanner;

public class TicTacToeStage5Of5 {

    static String hostName = "Host: ";

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

        printArray(board);
    }

    public static void printWelcomeMessage() {
        System.out.println(hostName + "Welcome players to TicTacToe!");
        System.out.println(hostName + "Player 1 will be playing as X, player 2 will be playing as O.");
        System.out.println(hostName + "Have fun :)");
    }

    // Prints the board
    public static void printArray(char[][] board) {
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