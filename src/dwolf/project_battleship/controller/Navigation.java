package dwolf.project_battleship.controller;

import dwolf.project_battleship.model.Ocean;
import dwolf.project_battleship.view.Radar;

public class Navigation {
    public void initialize() {
        int row = 10;
        int col = 10;
        Ocean ocean = new Ocean(row, col);
        Radar radar = new Radar();
        radar.detect(ocean.getQuadrant());
    }
}
