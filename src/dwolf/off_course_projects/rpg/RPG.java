package dwolf.off_course_projects.rpg;

import dwolf.off_course_projects.rpg.entities.Action;
import dwolf.off_course_projects.rpg.entities.Character;
import dwolf.off_course_projects.rpg.entities.Monster;

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
       Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What are you going to do?");
            System.out.println("1: attack\n2: defend\n3: cast spell");
            int input = scanner.nextInt();

            Action action = Action.fromInt(input);

            if (action == null) {
                System.out.printf("\nWhoops! Please only input numbers from %d to %d.\n\n",
                        Action.values()[0].getNumber(),
                        Action.values()[Action.values().length - 1].getNumber());
            } else {
                switch (action) {
                    case ATTACK:
                        battle(character, monster);
                        return;
                    case DEFEND:
                        character.defend(character, monster);
                        return;
                    case CAST_SPELL:
                        character.castSpell(character, monster);
                        return;
                    default:
                        System.out.println("\nError! Please only input 1, 2 or 3.");
                        break;
                }
            }
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