package Sam.auto;

public class Main {
    public static void main(String[] args) {

        Auto einAuto = new Auto(3, 2, 4);



        einAuto.tueren = 5;
        einAuto.reifen = 4;
        einAuto.fenster = 6;

        System.out.println("Mein Auto hat " + einAuto.tueren + " Türen und " + einAuto.reifen + " Reifen und " +
                einAuto.fenster + " Fenster.");

        System.out.println(einAuto.fahren());

        int sonstigeKosten = 50;
        int meineAusgabenVonHeute = einAuto.gesamtKosten(100, 30) + sonstigeKosten;

        System.out.println(meineAusgabenVonHeute);


    }
}
