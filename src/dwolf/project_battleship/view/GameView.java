package dwolf.project_battleship.view;

/*
 * Visual user interface
 * is responsible for presenting data to users or
 * handling user interaction
 * */

import dwolf.project_battleship.model.OceanModel;
import dwolf.project_battleship.model.CellModel;

public class GameView {
    public static void board(OceanModel oceanModel) {
        CellModel[][] ocean = oceanModel.getOcean();

        // Add numbers 1-10 for column enumeration above game board
        System.out.print("  ");
        for (int i = 0; i < ocean.length; i++) {
            if (i < ocean.length - 1) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print(i + 1);
            }
        }
        System.out.println();

        // Add characters A-J for row enumeration left of game board
        char ch = 'A';
        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean[i].length; j++) {
                if (j == 0) {
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print(ocean[i][j].getCellState());
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }

}
