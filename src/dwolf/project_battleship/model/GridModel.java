package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

public class GridModel implements GameModelInterface {
    private Character row;
    private Character column;

    public GridModel(Character row, Character column) {
        this.row = row;
        this.column = column;
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
}
