package dwolf.project_battleship.controller;

/*
 * Listens for input and reacts accordingly
 * informs the Model of the need for changes
 *
 * */

import dwolf.project_battleship.model.CellModel;
import dwolf.project_battleship.model.OceanModel;

public class RadarController {
    OceanModel ocean;
    CellModel cellModel;

    public RadarController() {
        int[] arr = new int[5];
        arr[0] = 1;
    }


    public static void runGame() {

    }
}
