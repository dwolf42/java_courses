package dwolf.project_battleship.model;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;

     Cell(int row, int col, CellState cellState) {
        this.row = row;
        this.col = col;
        this.cellState = cellState;
    }

     int getRow() {
        return row;
    }

     void setRow(int row) {
        this.row = row;
    }

     int getCol() {
        return col;
    }

     void setCol(int col) {
        this.col = col;
    }

     CellState getCellState() {
        return cellState;
    }

     void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
