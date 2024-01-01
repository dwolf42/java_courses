package dwolf.project_battleship;


import dwolf.project_battleship.model.CellState;
import dwolf.project_battleship.model.Grid;

import java.util.*;


public class GameSetup {
    public static void main(String[] args) {
        Map<String, CellState> board = new HashMap<>();
        board.put("A 3", CellState.OCEAN);
        System.out.println(board.get("A 3"));



    }
}


