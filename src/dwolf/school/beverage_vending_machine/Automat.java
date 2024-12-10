package dwolf.school.beverage_vending_machine;

import java.util.ArrayList;
import java.util.Scanner;

public class Automat {
    private ArrayList<Schacht> schaechte = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String name;
    double preis;
    int maxAnzahl;
    int anzahl;
    int menuPunkt;
    public void runAutomat() {
        System.out.println("Mit diesem Programm können Sie einen Gertränkeschacht verwalten.");
        System.out.println("Was möchten Sie tun?");
        System.out.println("  1  Neuen Schacht anlegen?");
        System.out.println("  2  Schächte verwalten?");

        menuPunkt = scanner.nextInt();

        switch (menuPunkt) {
            case 1:
                neuerSchacht();
                break;
            case 2:
                schaechteVerwalten();
                break;
            default:
                System.out.println("Error");
        }
    }

        private void neuerSchacht() {
            // Name
            System.out.println("Welches Getränk soll in dem Schacht angeboten werden?");
            name = scanner.nextLine();

            // Preis
            do {
                System.out.println("Welchen Preis soll eine Flasche" + name + " kosten?");
                preis = scanner.nextDouble();
            } while (preis <= 0);

            // Max Anzahl
            do {
                System.out.println("Wie hoch ist die maximale Anzahl " + name + " im Schacht?");
                maxAnzahl = scanner.nextInt();
            } while (maxAnzahl <= 0);

            // Anzahl
            do {
                System.out.println("Wie viel Stück von " + name + " sollen in den Schacht gefüllt werden?");
                anzahl = scanner.nextInt();
            } while (anzahl > maxAnzahl || anzahl <= 0);

            Schacht s1 = new Schacht(name, preis, maxAnzahl, anzahl);


        }

        private void schaechteVerwalten() {
            public void changeName(String name) {
                if(this.anzahl != -1 ) {
                    throw new Error("Der Schacht ist nicht leer.");
                } else {
                    this.name = name;
                }
            }
        }



    public void initSchacht() {

        Scanner scanner = new Scanner(System.in);
        // Objekt Schacht erzeugen
        Schacht limo = new Schacht(
                "Limo",
                2.0,
                0,
                10
        );

        try {
            limo.auffuellen(5);
        } catch (Exception error) {
            System.omjkut.println(error.getMessage());
        }
    }
}
