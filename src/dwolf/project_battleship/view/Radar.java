package dwolf.project_battleship.view;

/*
 * Visual user interface
 * is responsible for presenting data to users or
 * handling user interaction
 * */


import dwolf.project_battleship.model.State;

public class Radar {
    public void detect(State[][] quadrant) {

        // Add numbers 1-10 above game board for column enumeration
        System.out.print("  ");
        for (int i = 0  ; i < ocean.length; i++) {
            if (i < ocean.length - 1) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print(i + 1);
            }
        }
        System.out.println();

        // Add characters A-J left of game board for row enumeration
        char ch = 'A';
        for (int i = 0; i < ocean.length; i++) {
            System.out.print(ch + " ");
            ch++;
            for (int j = 0; j < ocean[i].length ; j++) {
                    System.out.print(ocean[i][j] + " ");
            }
            System.out.println();
        }
    }

}
