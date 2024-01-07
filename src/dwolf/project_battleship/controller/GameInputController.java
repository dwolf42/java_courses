package dwolf.project_battleship.controller;

/*
* Listens for input and reacts accordingly
* informs the Model of the need for changes
*
* */

import dwolf.project_battleship.model.Grid;

public class GameInputController {
    Grid ocean;

    public GameInputController(Grid ocean) {
        this.ocean = ocean;
    }
}
