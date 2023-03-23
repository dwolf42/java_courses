package rpg;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Character character = new Character("Xanlator", 200, 75, 1, 0, 15, 9, 5);
        Monster monster = new Monster("Mudd Hopper", 50, 7);
        System.out.println("The battle begins!\n");
        chooseAction(character, monster);
    }

    // This is the basis method where the game starts and to which the game may return after an action.
    static void chooseAction(Character character, Monster monster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you going to do?");
        System.out.println("1: attack\n2: defend\n3: cast spell\n");
        String action = scanner.nextLine();
        switch (action) {
            case "1":
                battle(character, monster);
                break;
            case "2":
                character.defend(character, monster);
                break;
            case "3":
                character.castSpell(character, monster);
                break;
            default:
                System.out.println("\nError! Please only input 1, 2 or 3.");
                chooseAction(character, monster);
                break;
        }
    }

    // First iteration that handles the general (melee?) fight player vs. monster.
    // TODO: Add monster vs. player fight.
    // TODO: Implement more natural behavior, player should have option to choose action after each attack.
    private static void battle(Character character, Monster monster) {
        while (character.getHealthPoints() > 0 && monster.getHealthPoints() > 0) {
            character.attack(character, monster);
            if (monster.getHealthPoints() > 0) {
                monster.attack(character, monster);
            }
        }

        if (character.getHealthPoints() > 0) {
            System.out.printf("Player %s wins!", character.getName());
        } else {
            System.out.printf("Monster %s wins!", monster.getName());
        }
    }


}
