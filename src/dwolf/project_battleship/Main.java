package dwolf.project_battleship;

import dwolf.project_battleship.setup.GameSetup;

// TODO: Ocean size must be fixed, too many columns, too many rows. Run program for more detail
public class Main {
    public static void main(String[] args) {
        GameSetup game = new GameSetup();
        game.initialize();
    }

}
