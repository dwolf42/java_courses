package rpg;

public class Monster {
    private String name;
    private int healthPoints;
    private int strength;

    public void attack(Character character, Monster monster) {
        // Reduces HP of attacked character, based on monsters strength
        character.setHealthPoints(character.getHealthPoints() - monster.getStrength());
        System.out.printf("Your HP: %d\n", character.getHealthPoints());
    }

    public Monster(String name, int healthPoints, int strength) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
