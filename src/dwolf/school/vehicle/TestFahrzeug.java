package dwolf.school.vehicle;

import java.util.ArrayList;

public class TestFahrzeug {

	public static void main(String[] args) {
		// Object creation of class Fahrzeug
		Fahrzeug golf = new Fahrzeug("VW-Golf", 6.5);
		Fahrzeug scudo = new Fahrzeug("FIAT Scudo", 8.3);

		// Fuel price set to 1,5€
		Fahrzeug.setBenzinpreis(1.5);

		// Diesel price set to 2,0€
		Fahrzeug.setDieselpreis(2.0);

		BenzinFahrzeug golfBenzin = new BenzinFahrzeug("VW-Golf", 6.5);
		DieselFahrzeug golfDiesel = new DieselFahrzeug("VW-Golf", 4.9);
		DieselFahrzeug scudoDiesel = new DieselFahrzeug("FIAT-Scudo", 8.3);

		// Benzinpreis == 1,5€, Dieselpreis == 1.0€
		Fahrzeug.setBenzinpreis(1.5);
		Fahrzeug.setDieselpreis(1.0);
		System.out.println("Fahrtkosten Golf Benzin " + golfBenzin.berechneFahrtkosten(100) + " €");
		System.out.println("Fahrtkosten Golf Diesel " + golfDiesel.berechneFahrtkosten(100) + " €");
		System.out.println("Fahrtkosten Scudo Benzin " + scudoDiesel.berechneFahrtkosten(100) + " €");

		// Benzinpreis == 2.0€, Dieselpreis == 1.5€
		Fahrzeug.setBenzinpreis(2.0);
		Fahrzeug.setDieselpreis(1.5);
		System.out.println("Fahrtkosten Golf Benzin " + golfBenzin.berechneFahrtkosten(100) + " €");
		System.out.println("Fahrtkosten Golf Diesel " + golfDiesel.berechneFahrtkosten(100) + " €");
		System.out.println("Fahrtkosten Scudo Benzin " + scudoDiesel.berechneFahrtkosten(100) + " €");

		System.out.println(" ");
		System.out.println(" ");

		// Array List of Fahrzeug

		ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
		fahrzeuge.add(new BenzinFahrzeug("BMW-5er", 8.6));
		fahrzeuge.add(new BenzinFahrzeug("VW-Scirocco", 10.8));
		fahrzeuge.add(new DieselFahrzeug("Audi-A6", 5.5));
		fahrzeuge.add(new DieselFahrzeug("Opel-Astra", 4.9));

		for (Fahrzeug fahrzeug: fahrzeuge) {
			System.out.println("Fahrkosten für " + fahrzeug.getType() + " betragen " + fahrzeug.berechneFahrtkosten(100) + " €");
		}
	}

}
