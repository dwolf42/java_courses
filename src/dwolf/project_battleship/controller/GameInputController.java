package dwolf.project_battleship.controller;

/*
* Listens for input and reacts accordingly
* informs the Model of the need for changes
*
* */

import dwolf.project_battleship.model.Ocean;

public class GameInputController {
    Ocean ocean;

    public GameInputController(Ocean ocean) {
        this.ocean = ocean;
    }
}
