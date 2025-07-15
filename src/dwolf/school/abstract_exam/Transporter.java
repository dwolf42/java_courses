package dwolf.school.abstract_exam;

public class Transporter extends Fahrzeug2 {
    private static double kmPreis;

    public Transporter(String typ, double kmPreis) {
        super(typ);
        this.kmPreis = kmPreis;
    }

    public double berechnePreis(int tage, int km) {
        return km * kmPreis + Fahrzeug2.getGrundPreis();
    }

    public double getKmPreis() {
        return Transporter.kmPreis;
    }
}
