package Sam.haus;

public class Main {

    // starts the program / entry point for the program
    public static void main(String[] args) {
        Haus meinHaus = new Haus();

        System.out.println("meinHaus: " + meinHaus.dach);
        System.out.println("meinHaus: " + meinHaus.fenster);
        System.out.println("meinHaus: " + meinHaus.tuer);

        meinHaus.dach = 2;
        meinHaus.fenster = 3;
        meinHaus.tuer = 1;

        System.out.println("meinHaus: "+ meinHaus.dach);
        System.out.println("meinHaus: " + meinHaus.fenster);
        System.out.println("meinHaus: " + meinHaus.tuer);
        System.out.println("");
//
//        Haus deinHaus = new Haus();
//
//        System.out.println("deinHaus: "+ deinHaus.dach);
//        System.out.println("deinHaus: " + deinHaus.fenster);
//        System.out.println("deinHaus: " + deinHaus.tuer);
//
//        deinHaus.dach = 1;
//        deinHaus.fenster = 4;
//        deinHaus.tuer = 1;
//
//        System.out.println("deinHaus: "+ deinHaus.dach);
//        System.out.println("deinHaus: " + deinHaus.fenster);
//        System.out.println("deinHaus: " + deinHaus.tuer);

    }
}
