package dwolf.project_battleship.model;

/*
 * Basic underlying data access and storage
 * is responsible for all data and its related logic
 * */

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private Set<Cell> cell;

    public Grid() {
        cell = new HashSet<>();
        for (int row = 0; row <= 9; row++) {
            for (int col = 0; col <= 9; col++) {
                cell.add(new Cell(row, col, CellState.OCEAN));
            }
        }
    }

    public void tests() {
        System.out.println(cell.);
    }

     public Set<Cell> getCell() {
        return cell;
    }

     void setCellState(Set<Cell> cells) {
        this.cell = cells;
    }
}
