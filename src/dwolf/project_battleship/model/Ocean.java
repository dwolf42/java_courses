package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

import java.util.ArrayList;
import java.util.List;

public class Ocean {
    private List<Cell> grid;

    public Ocean(int row, int col) {
        grid = new ArrayList<>();
        floodGrid();
        letterGrid();
    }

    private void floodGrid() {
        for (int cellNumber = 0; cellNumber <= 120; cellNumber++) {
            grid.add(new Cell(CellState.OCEAN.toString()));
        }
    }

    private void letterGrid() {
        char rowIndicatorChar = 'A';
        for (int rowIndicatorCharPosition = 11; rowIndicatorCharPosition <= 110; rowIndicatorCharPosition += 11) {
            grid.get(rowIndicatorCharPosition).
                    setCellState(String.valueOf(rowIndicatorChar));
            rowIndicatorChar++;
        }
    }
}
