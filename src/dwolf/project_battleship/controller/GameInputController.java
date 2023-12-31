package dwolf.project_battleship.controller;

/*
* Listens for input and reacts accordingly
* informs the Model of the need for changes
*
* */

import dwolf.project_battleship.model.GridModel;

public class GameInputController {
    GridModel ocean;

    public GameInputController(GridModel ocean) {
        this.ocean = ocean;
    }
}
