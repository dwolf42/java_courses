package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

public class Ocean {
    private Cell[][] grid;

    public Ocean() {
        final int row = 9;
        final int col = 9;
        grid = new Cell[row][col];

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                grid[i][j] = new Cell(CellState.OCEAN);
            }
        }
    }

    public CellState getGridCellState(int i, int j) {
        return grid[i][j].getCellState();
    }

    public void setGridCellState(int i, int j, Cell cellstate) {
        this.grid[i][j].setCellState(cellstate);
    }

}
