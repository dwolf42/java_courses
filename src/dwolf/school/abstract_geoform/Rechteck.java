package dwolf.school.abstract_geoform;

public class Rechteck implements GeoForm {
    protected double breite;

    protected double hoehe;

    public Rechteck(double breite, double hoehe) {

    }

    public double getUmfang() {
        return 2 * (breite + hoehe);
    }

    public double getFlaeche() {
        return breite * hoehe;
    }

    public String getTyp() {
        return "Rechteck";
    }
}
