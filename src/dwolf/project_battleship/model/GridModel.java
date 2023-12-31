package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

class GridModel implements GameModelInterface {
    private Character row;
    private Character column;
    private State cellState;

    GridModel(Character row, Character column, State cellState) {
        this.row = row;
        this.column = column;
        this.cellState = cellState;
    }

    @Override
    public Character getRow() {
        return row;
    }

    @Override
    public void setRow(Character row) {
        this.row = row;
    }

    @Override
    public Character getColumn() {
        return column;
    }

    @Override
    public void setColumn(Character column) {
        this.column = column;
    }

    @Override
    public State getCellState() {
        return cellState;
    }

    @Override
    public void setCellState(State cellState) {
        this.cellState = cellState;
    }
}
