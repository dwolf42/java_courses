package dwolf.project_battleship.controller;

/*
* Listens for input and reacts accordingly
* informs the Model of the need for changes
*
* */

import dwolf.project_battleship.model.OceanModel;

public class GameInputController {
    OceanModel ocean;

    public GameInputController(OceanModel ocean) {
        this.ocean = ocean;
    }
}
