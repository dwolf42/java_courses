package dwolf.laboratory.Sam.arraysAreFun;

public class Colors {
    public static void main(String[] args) {
        //                      0          1        2       3             4                  5      6
        String[] tabletten = {"Apsirin", "Viagra", "Ibu", "Penecillin", "Haarwuchsmittel", "Para", "Valium"};
        for (int i = 0; i < tabletten.length; i++) {
            System.out.println(tabletten[i]);
        }
        // v
        int[][] lotto = /*0*/ {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                //              0   1   2   3   4  5   6   7v
                /*1*/ {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};

        System.out.println("Auf Index 0 0 ist die Zahl: " + lotto[0][9]);
        System.out.println("Auf Index 1 7 ist die Zahl: " + lotto[1][7]);

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < lotto.length; j++) {
                System.out.print(lotto[i][j] + " ");
            }
            System.out.println("");
        }

        String[][] spielstaende = {{"Sam", "Dave", "Eibhlin", "Jana"}, // Spieler
                {"4", "1", "3", "1"}, // Erste Runde
                {"7", "5", "0", "9"}}; // Zweite Runde


    }

}
