package com.github.kabraxis.project_simple_chatty_bot;

import java.util.Scanner;

public class EnorilaSuper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Forced variable for automatic type inference by using "var" instead of int/String/double etc8876
        var mstr = " Snitgit ";

// Just Strings
        String cpu = "Enorila: ";
        String nxt = "\nDrücke Enter...\n";
        String usr = " ";

// Assigning values to multiple int-variables in a single line of code
        int cpuAge = 21, cpuHight = 155, cpuSiblings = 2;

// Declaring a variable as String and assigning a value to this variable in two steps. By this you can also save a value entered by the user in a loop for the next loop.
        String cpuHomeTown;
        cpuHomeTown = "Angel City";

/* Uncomment before release!
This is how the user should start the Programm.
// Introduction of the program
    System.out.println(nxt);
    scanner.nextLine();
 */

//--> Admin Mode
        int section;

        System.out.println('\n' + cpu + "Hallo" + mstr + ", mit welcher Sektion willst du beginnen?");
        System.out.print(mstr + ": ");
        section = scanner.nextInt();

        if (section != 0) {
            System.out.println(cpu + "Alles klar, ich starte Sektion " + section + ", zudem wurde 'usr' definiert.");
            usr = "Snitgit";
            scanner.nextLine();
            scanner.nextLine();
        } else {
            System.out.println(cpu + "Alles klar, einmal das volle Programm!");
            scanner.nextLine();
            scanner.nextLine();
        }
//--> Admin Mode

        // Section 1
        if (section == 0 || section == 1) {
// Introduction of the program
            System.out.println(nxt);
            scanner.nextLine();

            System.out.println('\n' + cpu + "Hallo und herzlich willkommen!");
            System.out.println(cpu + "Mein Name ist Enorila und ich bin der Engel, der dich auf deiner Entdeckungsreise durch die Sammlung der bisher gelernten Fähigkeiten meines Schöpfers" + mstr + "begleitet.");
            System.out.println(nxt);
            scanner.nextLine();

            System.out.println(cpu + "Dabei werde ich dir ein wenig von mir erzählen, dir ein paar Fragen stellen, wir werden Spiele spielen und im Hintergrund wird ganz viel Code ablaufen.");
            System.out.println(cpu + "Zudem erhältst du natürlich bei jedem Schritt eine Info darüber, was wir tun werden und vor allem, was es dabei für dich zu entdecken gibt.");
            System.out.println(cpu + "Sei dir bitte gewiss: Alles was du hier sehen wirst, wurde von Hand geschrieben und von Herzen erdacht.");
            System.out.println(cpu + "Nun aber wünsche ich dir ganz viel Spaß beim 'Simple Chatty Bot'!");
            System.out.println(nxt);
            scanner.nextLine();
        }

        // Section 2
        if (section == 0 || section == 2) {
// Making use of Scanner
            System.out.println(cpu + "Da du schon meinen Namen kennst bist du jetzt dran mir deinen zu verraten. Tippe ihn über die Tastatur ein und bestätige mit der Eingabetaste.");
            System.out.println(cpu + "Damit demonstriert" + mstr + "die Anwendung des Java-Utility , womit Tastatureingaben des Benutzer erkannt werden.");
            System.out.println(cpu + "Probiere es gleich einmal aus und gib deinen Namen über die Tastatur ein. Wenn du fertig bist damit, beende deine Eingabe mit der Entertaste.");
// Getting users name in a nice way
            System.out.print("Mein Name lautet: ");
            usr = scanner.nextLine();
            System.out.println('\n' + cpu + "Was für einen schönen Namen du hast, " + usr + "! Ich freue mich, dich kennenzulernen und bei dir zu sein.");
            System.out.println(nxt);
            scanner.nextLine();
        }

        // Section 3
        if (section == 0 || section == 3) {

            System.out.println(cpu + "Als nächstes, " + usr + ", werde ich dir einige weitere Details über mich verraten.");
            System.out.println(cpu + "Zweck der Übung ist das Wiederholen der Wertzuweisung von Variablen.");
            System.out.println(cpu + "Im Reich der Engel wohne ich in der wunderschönen " + cpuHomeTown + ", ich bin " + cpuAge + " Jahre alt und " + cpuHight + "cm groß.");
            System.out.println(cpu + "Damit bin ich die Kleinste in der Familie, denn ich habe noch " + cpuSiblings + " Geschwister.");
            System.out.println(nxt);
            scanner.nextLine();
        }

        // Section 4
        if (section == 0 || section == 4) {

// Age Guessing Game
            // Explanation part
            System.out.println(cpu + "In diesem Teil bist du jetzt wieder gefragt mitzumachen, denn ich werde mit ein wenig Magie dein Alter erraten!");
            System.out.println(cpu + "Hihihi, nun ja, Magie ist es nicht ganz, sondern die Anwendung der Rechenart Modulo. Das ist fast genauso cool.");
            System.out.println(cpu + "Keine Bange, es ist ganz einfach: Starte den Windows Taschenrechner, gib ein Alter ein, dann drücke die Module-Taste '%' auf deiner Tastatur und anschließend gibst du die Zahl ein, um die ich dich bitte.");
            System.out.println(cpu + "Deine Eingabe sieht dann ungefähr so aus '" + cpuAge + " % 3'.");
            System.out.println(cpu + "Nur keine Angst, es ist wie gesagt ganz einfach :)");
            System.out.println(nxt);
            scanner.nextLine();
            // Getting user input
            System.out.println(cpu + "Fangen wir mit dem ersten Modulo an, er lautet '3'");
            System.out.print(usr + ": Mein Ergebnis ist: ");
            int modulo3 = scanner.nextInt();
            System.out.println('\n' + cpu + "Gut so! Der nächste Modulo lautet '5'");
            System.out.print(usr + ": Mein Ergebnis ist: ");
            int modulo5 = scanner.nextInt();
            System.out.println('\n' + cpu + "Sehr gut! Gleich geschafft!");
            System.out.println(cpu + "Der letzte Modulo lautet '7'");
            System.out.print(usr + ": Mein Ergebnis ist: ");
            int modulo7 = scanner.nextInt();
            System.out.println('\n' + cpu + "Super! Na siehst du, war doch gar nicht so wild ;)");
            System.out.println(cpu + "Also dann lass mich mal rechnen... " + modulo3 + " und... " + modulo5 + " und ... " + modulo7 + " ...");
// Prevents the upcoming nextLine() from unwanted execution.
            scanner.nextLine();
            System.out.println(nxt);
            scanner.nextLine();
            System.out.println(cpu + "Das macht dann... ");
// Prevents the upcoming nextLine() from unwanted execution.
            scanner.nextLine();
            // Actual calculation
            // 1 4 6
            int usrAge = (modulo3 * 70 + modulo5 * 21 + modulo7 * 15) % 105;
            System.out.println(cpu + "Dein Alter ist " + usrAge + "!");
            System.out.println(cpu + "Naa? Hab ich dir zu viel versprochen? hehehe");
            System.out.println(nxt);
            scanner.nextLine();
        }

        // Section 5
        if (section == 0 || section == 5) {
// Binary arithmetic operators
            System.out.println(cpu + "Weil wir gerade beim Rechnen und Zahlen sind... Als nächstes werde ich ein paar Rechnungen für dich durchführen.");
            System.out.println(cpu + "Nenn mir deine Lieblingszahl.");
            System.out.print(usr + ": ");
            long addition = scanner.nextLong();
            System.out.println('\n' + cpu + "Deine Lieblingszahl lautet: " + addition);
            System.out.println(cpu + "Mit welcher Zahl möchtest du sie addieren?");
            System.out.print(usr + ": ");
            long addition2 = scanner.nextLong();
            // Prevents the upcoming nextLine() from unwanted execution.
            scanner.nextLine();
            System.out.println('\n' + cpu + "Die zu addierende Zahl lautet: " + addition2);
            System.out.print(cpu + "Also ist... " + (addition + addition2) + " das korrekte Ergebnis!");
            System.out.println(nxt);
            scanner.nextLine();
        }

        // Section 99
        if (section == 0 || section == 99) {
// End of code
            System.out.println(cpu + usr + ", wir sind nun am Ende des 'Simple Chatty Bot' angelangt.");
            System.out.println(cpu + "Mein Schöpfer" + mstr + "und ich bedanken uns ganz herzlich für's Ausprobieren und wünschen dir noch einen schöne Zeit.");
            System.out.println(cpu + "Bis zum nächsten Mal ^,~");
            System.out.println("\nDrücke Enter, um das Programm zu beenden...");
            scanner.nextLine();
        }

// This is closing the scanner - obviously
        scanner.close();

    } // method
} // class
