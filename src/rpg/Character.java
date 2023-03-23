package rpg;

public class Character {
    private String name;
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int experiencePoints;
    private int strength;
    private int dexterity;
    private int intelligence;

    public void attack(Character character, Monster monster) {
        // Reduces HP of attacked monster, based on characters strength
        monster.setHealthPoints(monster.getHealthPoints() - character.getStrength());
        System.out.printf("%s's HP: %d\n", monster.getName(), monster.getHealthPoints());
    }

    // If the amount of dexterity is too high, it could lead to players seeing negative numbers for reduced damage.
    // The if/else statement checks for such a szenario.
    public void defend(Character character, Monster monster) {
        if (character.getDexterity() - monster.getStrength() <= 0) {
            System.out.printf("Elegantly you evade the hits of %s!", monster.getName());
            RPG.chooseAction(character, monster);
        } else {
            character.setHealthPoints(character.getHealthPoints() - (character.getDexterity() - monster.getStrength()));
            System.out.printf("Your HP: %d\n", character.getHealthPoints());
            RPG.chooseAction(character, monster);
        }
    }

    // Magic damage can inflict huge amounts of actual damage, if the player chooses to stat int instead of str.
    // In my imagination a mage isn't physically strong, and because of that I wanted to give the player some kind
    // of punishment if they stat strength.
    public void castSpell(Character character, Monster monster) {
        // Reduces the monsters HP based on the attacking character's intelligence and MP.
        if (character.getManaPoints() <= 0) {
            System.out.println("You hear a glimmering sound, but nothing happens...");
            RPG.chooseAction(character, monster);
        }
        monster.setHealthPoints(monster.getHealthPoints() - ((character.getIntelligence() * 10 / character.getStrength()) + 5));
        character.setManaPoints(character.getManaPoints() - 10);
        System.out.printf("%s's HP: %d\n", monster.getName(), monster.getHealthPoints());
        RPG.chooseAction(character, monster);
    }

    public Character(String name, int healthPoints, int manaPoints, int level, int experiencePoints, int strength,
                     int dexterity, int intelligence) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.level = level;
        this.experiencePoints = experiencePoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;

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

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoint() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
