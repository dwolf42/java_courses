package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

public class OceanModel {
    private CellModel[][] ocean;

    public OceanModel(int row, int col) {
        ocean = new CellModel[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ocean[i][j] = new CellModel(CellState.OCEAN);
            }
        }
    }

    public CellState getOceanCellState(int i, int j) {
        return ocean[i][j].getCellState();
    }

    public void setOceanCellState(int i, int j, CellState cellState) {
        ocean[i][j].setCellState(cellState);
    }


}
