package dwolf.project_battleship.model;

public class Cell {

    private CellState cellState;

    public Cell(CellState cellState) {

        this.cellState = cellState;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
