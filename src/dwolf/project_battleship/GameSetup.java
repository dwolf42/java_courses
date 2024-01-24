/*
 * Gameboard contains Ship objects, which have data about
 * their coordinates and how many hits taken/sunken.
 *
 * How are ships going to get placed at the beginning of the game?
 *
 * How will you show a user their gameplay grid?
 * How will you know when a ship is sunk?
 * How will you know when all ships are sunk, and the game is over?
 *
 * The benefit of a dedicated board class now comes with the behavior - i.e., the methods. So this is OOP at its best:-)
 * And there you have things, that your Board can be responsible for - namely all actions, which can be performed, that
 *  just need the state of the board:
 *
 * In my implementation I made the Battlefield as I called it responsible for
 * validating coordinates (for a shot or ship positioning)
 * determining whether a ship could be positioned at given coordinates
 * position a ship at those validated coordinates
 *
 * But depending on your design there can be more or different things your board can do
 * */
package dwolf.project_battleship;

import dwolf.project_battleship.model.CellState;
import dwolf.project_battleship.model.OceanModel;

public class GameSetup {
    public static void main(String[] args) {
        // instantiate Ocean, call GameView.board and print Ocean
        final int initialRows = 10;
        final int initialCols = 10;
        final CellState initialCellState = CellState.OCEAN;
        OceanModel ocean = new OceanModel(initialRows, initialCols, initialCellState);
    }

}
