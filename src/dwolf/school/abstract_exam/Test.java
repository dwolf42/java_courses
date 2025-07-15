package dwolf.school.abstract_exam;

public class Test {
    public static void main(String[] args) {
        Fahrzeug2.setGrundPreis(30);
        Fahrzeug2 f1 = new Transporter("Mercedes Sprinter", 2.5);
        PKW f2 = new PKW("VW-Passat", 40);
        Fahrzeug2 f3 = new PKW("Rolls Royce", 120);
        PKW f4 = new PKW("Peugeot Expert", 90);
// Fehler Datentyp
        Fahrzeug2 f5 = new Transporter("Citroen Jumpy", 1.8);
        // Fahrzeug2 f6 = new Fahrzeug2("VW-Bus"); // Fahrzeug ist abstrakt und kann nicht instanziiert werden
// keine Erzeugung von Objekten abstrakter Klassen
        System.out.println("Preis Sprinter:" + f1.berechnePreis(1, 250));
        // System.out.println("Km-Preis Sprinter:" + f1.getKmPreis()); // getKmPreis ist nicht in Fahrzeug2 enthalten
// kein Zugriff auf Methode getKmPreis
        System.out.println("Preis Rolls Royce:"+ f3.berechnePreis(2,99));
        System.out.println("GrundPreis:"+ f5.getGrundPreis());
//        System.out.println("Preis:" + Fahrzeug2.berechnePreis(1, 50)); // Zugriff auf statische Methode aus non-static Kontext nicht möglich
// berechnePreis ist nicht static
//        System.out.println("TagesPreis:" + f3.getTagesPreis()); // getTagesPreis nicht in Fahrzeug enthalten
//get tagesPreis ist nicht sichtbar
    }
}