package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

public class OceanModel {
    private CellModel[][] ocean;

    public OceanModel(int row, int col, CellModel state) {
        ocean = new CellModel[row][col];
        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean[i].length; j++) {
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

    public CellModel[][] getOcean() {
        CellModel[][] copyOfOcean = new CellModel[ocean.length][ocean[0].length];
        for (int i = 0; i < copyOfOcean.length; i++) {
            for (int j = 0; j < copyOfOcean[i].length; j++) {
                copyOfOcean[i][j] = ocean[i][j];
            }
        }
        return copyOfOcean;
    }


}
