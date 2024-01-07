package dwolf.project_battleship.view;

/*
* Visual user interface
* is responsible for presenting data to users or
* handling user interaction
* */

public class GameView {
    public static void board() {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print(i + 1);
            }
        }
        System.out.println();

        char a = 'A';
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 10; j++) {
                if (j == 0) {
                    System.out.print(a + " ");
                    a++;
                } else {
                    System.out.print('~');
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }

}
