package dwolf.school.beverage_vending_machine;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<Slot> slots = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private double price;
    private int maxAmount;
    private int amount;
    private int menuPunkt;
    private boolean isRunning;

    public void runMachine() {
        isRunning = true;
        
        while (isRunning) {
            System.out.println("Mit diesem Programm können Sie einen Gertränkeschacht verwalten.");
            System.out.println("Was möchten Sie tun?");
            System.out.println("  1  Neuen Schacht anlegen?");
            System.out.println("  2  Schächte verwalten?");

            menuPunkt = scanner.nextInt();

            switch (menuPunkt) {
                case 1:
                    newSlot();
                    break;
                case 2:
                    maintainSlot();
                    break;
                default:
                    System.out.println("Error, falsche Eingabe.");
                    break;
            }
        }
    }

    private void newSlot() {
        if (slots.size() == 10) {
            System.out.println("Alle Getränkeschächte sind belegt. Bitte entleeren Sie einen Schacht.");
        }

        Scanner scanner = new Scanner(System.in);

        // Name
        do {
            System.out.println("Welches Getränk soll in dem Schacht angeboten werden?");
            name = scanner.nextLine().trim();
        } while (name.isEmpty());

        // Price
        do {
            System.out.println("Welchen Preis soll eine Flasche" + name + " kosten?");
            price = scanner.nextDouble();
        } while (price <= 0);

        // Max Amount
        do {
            System.out.println("Wie hoch ist die maximale Anzahl " + name + " im Schacht?");
            maxAmount = scanner.nextInt();
        } while (maxAmount <= 0);

        // Amount
        do {
            System.out.println("Wie viel Stück von " + name + " sollen in den Schacht gefüllt werden?");
            amount = scanner.nextInt();
        } while (amount > maxAmount || amount <= 0);

        slots.add(new Slot(name, price, maxAmount, amount));

    }

    private void maintainSlot() {

    }


}

