package SmallProjects;/* ~ Planned program ~ Skills have to be learned. Code has to be build.
 * -- DSA-Helper --
 * Goal is to write a program that tells you on what Stats you have to roll your dice for a certain action,
 * and if the rolled number must be higher than your Stat or lower in order to succeed.
 * Bow Attack:
 * Roll: 1D20 -> if higher than your FK, attack fails.
 */

import java.util.Scanner;

public class PLANNED_DSAHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fk = 19;
        String bogenAT = "Um mit dem Bogen anzugreifen, wirf einen W20." + '\n' + "Ist die Zahl <" + " " + fk + " " + "triffst du. Andernfalls verfehlt dein Schuss.";

        System.out.println(bogenAT);

        scanner.close();
    }

}

