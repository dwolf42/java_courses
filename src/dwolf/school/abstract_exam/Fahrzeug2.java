package dwolf.school.abstract_exam;

public abstract class Fahrzeug2 {
    static private double grundPreis;
    private String typ;

    public Fahrzeug2(String typ) {
        this.typ = typ;
    }

    public static double getGrundPreis() {
        return grundPreis;
    }

    public static void setGrundPreis(double grundPreis) {
        Fahrzeug2.grundPreis = grundPreis;
    }


    public abstract double berechnePreis(int tage, int km);
}
