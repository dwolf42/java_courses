package dwolf.school.vehicle;

public class DieselFahrzeug extends Fahrzeug{

    DieselFahrzeug(String typ, double verbrauch) {
       super(typ + "-Dieselmotor", verbrauch);
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public String getTyp() {
        return getType();
    }
    public double berechneFahrtkosten(double km) {
        return getVerbrauch() / 100 * km * Fahrzeug.getDieselpreis();
    }
}
