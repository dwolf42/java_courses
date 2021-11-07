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
