package dwolf.school.abstract_exam;

public class PKW extends Fahrzeug2 {
    private double tagesPreis;

    public PKW(String typ, double tagesPreis) {
        super(typ);
        this.tagesPreis = tagesPreis;
    }

    public double berechnePreis(int tage, int km) {
        return tage * tagesPreis + Fahrzeug2.getGrundPreis();
    }

    public double getTagesPreis() {
        return tagesPreis;
    }
}
