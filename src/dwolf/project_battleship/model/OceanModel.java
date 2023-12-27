package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

public class OceanModel {
    private Character row;
    private Character column;

    public OceanModel(Character row, Character column) {
        this.row = row;
        this.column = column;
    }

    public Character getRow() {
        return row;
    }

    public void setRow(Character row) {
        this.row = row;
    }

    public Character getColumn() {
        return column;
    }

    public void setColumn(Character column) {
        this.column = column;
    }
}
