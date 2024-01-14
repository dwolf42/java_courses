package dwolf.project_battleship.model;

public class CellModel {

    private CellState cellState;

    public CellModel(CellState cellState) {
        this.cellState = cellState;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
