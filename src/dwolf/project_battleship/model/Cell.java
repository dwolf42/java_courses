package dwolf.project_battleship.model;

public class Cell {
    private int row;
    private int col;
    private State cellState;

    public Cell(int row, int col, State cellState) {
        this.row = row;
        this.col = col;
        this.cellState = cellState;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public State getCellState() {
        return cellState;
    }

    public void setCellState(State cellState) {
        this.cellState = cellState;
    }
}
