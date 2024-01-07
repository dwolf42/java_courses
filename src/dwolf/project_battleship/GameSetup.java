/*
* Gameboard contains Ship objects, which have data about
* their coordinates and how many hits taken/sunken.
*
* How are ships going to get placed at the beginning of the game?

How will you show a user their gameplay grid?
* How will you know when a ship is sunk?
* How will you know when all ships are sunk, and the game is over?
*
* */
package dwolf.project_battleship;

import dwolf.project_battleship.model.Cell;
import dwolf.project_battleship.model.CellState;

import java.util.ArrayList;
import java.util.List;

public class GameSetup {
    public static void main(String[] args) {
        List<Cell> cells = new ArrayList<>();
        for (int cellNumber = 0; cellNumber <= 120; cellNumber++) {
            cells.add(new Cell(CellState.OCEAN));
        }

        char rowIndicatorChar = 'A';
        for (int rowIndicatorCharPosition = 11; rowIndicatorCharPosition <= 110; rowIndicatorCharPosition += 11) {
            cells.get(rowIndicatorCharPosition).
                    setCellState(CellState.
                            fromSymbol(
                                    String.valueOf(rowIndicatorChar)));
            rowIndicatorChar++;
            // 000B 11
        }

        int lineBreak = 0;
        for (int iterator = 0; iterator <= 120; iterator++, lineBreak++) {
            System.out.print(cells.get(iterator).getCellState() + " ");
            if (lineBreak == 10) {
                System.out.println();
                lineBreak = -1;
            }
        }
        /*
           0      1      2    3      4     5     6    7     8     9     10
        0 [   0][   1][   2][   3][   4][   5][   6][   7][   8][   9][  10]
        1 [ A11][ X12][  13][  14][  15][  16][  17][  18][  19][  20][  21]
        2 [ B22][ X23][  24][  25][  26][  27][  28][  29][  30][  31][  32]
        3 [ C33][ X34][  35][  36][  37][  38][  39][  40][  41][  42][  43]
        4 [ D44][ X45][  46][  47][  48][  49][  50][  51][  52][  53][  54]
        5 [ E55][ X56][  57][  58][  59][  60][  61][  62][  63][  64][  65]
        6 [ F66][  67][  68][  69][  70][  71][  72][  73][  74][  75][  76]
        7 [ G77][  78][  79][  80][  81][  82][  83][  84][  85][  86][  87]
        8 [ H88][  89][  90][  91][  92][  93][  94][  95][  96][  97][  98]
        9 [ I99][ 100][ 101][ 102][ 103][ 104][ 105][ 106][ 107][ 108][ 109]
       10 [J110][ 111][ 112][ 113][ 114][ 115][ 116][ 117][ 118][ 119][ 120]

       10 [A][111][2][3][4][5][6][7][8][9][120]

         */

    }

}
