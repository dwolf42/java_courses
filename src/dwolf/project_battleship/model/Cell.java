package dwolf.project_battleship.model;

public class Cell {

    private String cellState;

    public Cell(String cellState) {

        this.cellState = cellState;
    }

    public String getCellState() {
        return cellState;
    }

    public void setCellState(String cellState) {
        this.cellState = cellState;
    }
}
