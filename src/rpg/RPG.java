package rpg;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        System.out.println("The battle begins!\n");
        entitySpawn();
    }

    // This method allows a later implementation for a more individual character creation
    private static void entitySpawn() {
        Character character = new Character("Xanlator", 200, 75, 1, 0, 15, 9, 5);
        Monster monster = new Monster("Mudd Hopper", 50, 7);
        chooseAction(character, monster);
    }

    // This is the basis method where the game starts and to which the game may return after an action.
    public static void chooseAction(Character character, Monster monster) {
        final int ATTACK = 1;
        final int DEFEND = 2;
        final int CAST_SPELL = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you going to do?");
        System.out.println("1: attack\n2: defend\n3: cast spell\n");
        int action = scanner.nextInt();

        switch (action) {
            case ATTACK:
                battle(character, monster);
                break;
            case DEFEND:
                character.defend(character, monster);
                break;
            case CAST_SPELL:
                character.castSpell(character, monster);
                break;
            default:
                System.out.println("\nError! Please only input 1, 2 or 3.");
                chooseAction(character, monster);
                break;
        }
    }

    // First iteration that handles the general (melee?) fight player vs. monster.
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
