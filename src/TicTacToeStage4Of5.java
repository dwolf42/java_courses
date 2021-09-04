import java.util.Scanner;

public class TicTacToeStage4Of5 {
    public static void main(String[] args) {

        char[] templateBoard = inputTemplateBoard();
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

        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                board[i][j] = templateBoard[k];
                k++;
            }
        }

        printIt(board);

        /*
        * loop soll nach der Playereingabe fragen und feststellen, ob sie gültig ist.
        * Bei ungültiger Eingabe soll der Loop wieder von vorn beginnen
        *
        * */
//        while(!isValidTurn(board, getCoordinates())) {
//            getCoordinates();
//        }

//        _XXOO_OX_

    }
    /*
     * In this method the user is asked to enter the basic / starter game board.
     * Input is cast to upper case and a char array is created out of it.
     */
    public static char[] inputTemplateBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");

        return scanner.nextLine().toUpperCase().toCharArray();
    }

    public static int[] getCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates: ");
        String[] coordinates = scanner.nextLine().split(" ");

        return new int[]{Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])};
    }

    public static boolean isValidTurn(char[][] board, int[] getCoordinates) {
        // must get the current board and user coordinates
        // must check if cell is already occupied
        // must check if there's still unoccupied cells
        // must terminate game if no more moves possible? - check description

        return false; // placeholder
    }

    public static void printIt(char[][] board) {
        System.out.println("---------"); // Top board line
        for (char[] ch : board) {
            System.out.print("| "); // Leading vertical bar
            for (char cha : ch) {
                System.out.print(cha + " ");
            }
            System.out.print("|" + '\n'); // Tailing vertical bar
        }
        System.out.println("---------"); // Lower board line
    }
}

/*

Create 2d array 3x3:

(1, 1) (1, 2) (1, 3)
(2, 1) (2, 2) (2, 3)
(3, 1) (3, 2) (3, 3)
- Ask user to enter coordinates:
1, 1, or 2, 3 etc.
1. Coordinate is top to bottom (i)
2. Coordinate is left to right (j)
Coordinates range 1-3(i), 1-3(j)
- Player is always X

- wrong coordinates gridAnalyzer():
while-loop
3, 4 = error message: Coordinates should be from 1 to 3!
occupied cell = error message: This cell is occupied! Choose another one!
input != numbers = error message: You should enter numbers!

Prompt the user to make a move.
the field will be the first line of input, and the 2 coordinate numbers will be the second line of input
print grid after every move
output the field 2 times: once before the user’s move, and once  after the user has entered a legal move.


*/

/*
It’s time to make our game interactive! Now we’re going to add the ability for a user to make a move.

To do this, we need to divide the grid into cells.

Suppose the top left cell has the coordinates (1, 1) and the bottom right cell has the coordinates (3, 3) like in this table:

(1, 1) (1, 2) (1, 3)
(2, 1) (2, 2) (2, 3)
(3, 1) (3, 2) (3, 3)

The program should ask the user to enter the coordinates of the cell where they want to make a move.

In this stage, the user plays as X, not O. Keep in mind that the first coordinate goes from top to bottom and the second
coordinate goes from left to right. Also note that coordinates start with 1 and can be 1, 2, or 3.

What happens if the user enters incorrect coordinates? The user could enter symbols instead of numbers, or enter
coordinates representing occupied cells or cells that aren’t even on the grid. You need to check the user's input and
catch possible exceptions.

Objectives
The program should work as follows:

Get the 3x3 grid from the input as in the previous stages.
Output this 3x3 grid as in the previous stages.
Prompt the user to make a move.
The user should input 2 numbers that represent the cell where they want to place their X. (the 9 symbols representing
the field will be the first line of input, and the 2 coordinate numbers will be the second line of input)
Analyze user input and show messages in the following situations:
This cell is occupied! Choose another one! if the cell is not empty.
You should enter numbers! if the user enters non-numeric symbols in the coordinates input.
Coordinates should be from 1 to 3! if the user enters coordinates outside the game grid.
Update the grid to include the user's move and print the updated grid to the console.
The program should also check the user’s input. If the input is unsuitable, the program should tell the user why their
input was wrong, and prompt them to enter coordinates again.

To summarize, you need to output the game grid based on the first line of input, and then ask the user to enter a move.
Keep asking until the user enters coordinates that represent an empty cell on the grid, update the grid to include that
move, and then output it to the console. You should output the field only 2 times: once before the user’s move, and once
 after the user has entered a legal move.

Do not delete the code you already wrote that analyzes the game state; you will need it in the final step of this project.

The project was changed. Now the coordinates start from the upper left corner. Look closely at the examples.
Examples
The examples below show how your program should work.

Notice that after Enter cells: and Enter the coordinates: comes the user input.

Example 1:

Enter cells: X_X_O____
---------
| X   X |
|   O   |
|       |
---------
Enter the coordinates: 3 1
---------
| X   X |
|   O   |
| X     |
---------

Example 2:

Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 1 1
---------
| X X X |
| O O   |
| O X   |
---------
Example 3:

Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 3 3
---------
|   X X |
| O O   |
| O X X |
---------
Example 4:

Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 2 3
---------
|   X X |
| O O X |
| O X   |
---------
Example 5:

Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 3 1
This cell is occupied! Choose another one!
Enter the coordinates: 1 1
---------
| X X X |
| O O   |
| O X   |
---------
Example 6:

Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: one
You should enter numbers!
Enter the coordinates: one one
You should enter numbers!
Enter the coordinates: 1 1
---------
| X X X |
| O O   |
| O X   |
---------
Example 7:

Enter cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 4 1
Coordinates should be from 1 to 3!
Enter the coordinates: 1 4
Coordinates should be from 1 to 3!
Enter the coordinates: 1 1
---------
| X X X |
| O O   |
| O X   |
---------

/////// Old states of board
Example 1:

Enter cells: XXXOO__O_
---------
| X X X |
| O O _ |
| _ O _ |
---------
X wins
Example 2:

Enter cells: XOXOXOXXO
---------
| X O X |
| O X O |
| X X O |
---------
X wins
Example 3:

Enter cells: XOOOXOXXO
---------
| X O O |
| O X O |
| X X O |
---------
O wins
Example 4:

Enter cells: XOXOOXXXO
---------
| X O X |
| O O X |
| X X O |
---------
Draw
Example 5:

Enter cells: XO_OOX_X_
---------
| X O   |
| O O X |
|   X   |
---------
Game not finished
Example 6:

Enter cells: XO_XO_XOX
---------
| X O _ |
| X O _ |
| X O X |
---------
Impossible
Example 7:

Enter cells: _O_X__X_X
---------
|   O   |
| X     |
| X   X |
---------
Impossible
Example 8:

Enter cells: _OOOO_X_X
---------
|   O O |
| O O   |
| X   X |
---------
Impossible


*/

