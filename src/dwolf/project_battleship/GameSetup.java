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

import dwolf.project_battleship.view.GameView;

public class GameSetup {
    public static void main(String[] args) {
        GameView.board();
    }

}
