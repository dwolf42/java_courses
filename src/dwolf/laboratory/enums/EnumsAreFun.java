package dwolf.laboratory.enums;

import java.util.Scanner;

class EnumsAreFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What are you going to do?");
            System.out.println("1: attack\n2: defend\n3: cast spell");
            int input = scanner.nextInt();

            Action action = Action.fromInt(input);

            if (action == null) {
                System.out.printf("\nError! Please only input numbers from %d to %d.\n\n",
                        // Of the enum 'Action' I return an array of its constants with 'values()',
                        // '[0]' is to get only the first index of the constants, which is 'ATTACK'.
                        // Using 'getValue()', I get the corresponding int 'value'.
                        Action.values()[0].getValue(),

                        // Much like above, but here I have to specify the last index of the returned array of constants
                        // by getting the length of the enum array.
                        Action.values()[Action.values().length - 1].getValue());
            } else {
                switch (action) {
                    case ATTACK:
                        System.out.println("CHARGE !!");
                        return;
                    case DEFEND:
                        System.out.println("SHIELD !!");
                        return;
                    case CAST_SPELL:
                        System.out.println("BBBRRRRZZZZLLL !!");
                        return;
                }
            }
        }

    }
}
