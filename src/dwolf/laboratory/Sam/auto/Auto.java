package Sam.auto;

public class Auto {
    int fenster;
    int tueren;
    int reifen;

    public void fahren1() {
        System.out.println("Brumm Brumm Brumm\nIch fahre los");
    }

    public int enoughFuel(int kilometers, int fuel) {
        final int fuelUsage = 5;
        int usage = (kilometers / fuelUsage) - fuel;

        return usage;
    }

    public int gesamtKosten(int kostenTank, int kostenOel) {
        int alleKostenZusammen = kostenTank + kostenOel;
        return alleKostenZusammen;
    }

    public Auto(int fenster, int tueren, int reifen) {
        this.fenster = fenster;
        this.tueren = tueren;
        this.reifen = reifen;
    }
}
