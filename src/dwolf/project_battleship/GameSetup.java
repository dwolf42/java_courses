/*
* Gameboard contains Ship objects, which have data about
* their coordinates and how many hits taken/sunken.
*
* How are ships going to get placed at the beginning of the game?

How will you show a user their gameplay grid?
* How will you know when a ship is sunk?
* How will you know when all ships are sunk, and the game is over?
*
* The benefit of a dedicated board class now comes with the behavior - i.e. the methods. So this is OOP at its best:-)
And there you have things, that your Board can be responsible for - namely all actions, which can be performed, that just need the state of the board:

In my implementation I made the Battlefield as I called it responsible for
validating coordinates (for a shot or ship positioning)
determining whether a ship could be positioned at given coordinates
position a ship at those validated coordinates

But depending on your design there can be more or different things your board can do
* */
package dwolf.project_battleship;

public class GameSetup {
    public static void main(String[] args) {
        // instantiate Ocean, call GameView.board and print Ocean

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

         */

    }

}
