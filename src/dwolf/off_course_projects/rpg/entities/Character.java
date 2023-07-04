package dwolf.off_course_projects.rpg.entities;

import dwolf.off_course_projects.rpg.RPG;

public class Character {
    private String name;
    private int healthPoints;
    private int manaPoints;
    private int level;
    private int experiencePoints;
    private int strength;
    private int dexterity;
    private int intelligence;

    // Very basic attacking
    public void attack(Character character, Monster monster) {
        // Reduces HP of attacked monster, based on character strength
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
        if (character.getManaPoints() <= 0) {
            System.out.println("You hear a glimmering sound, but nothing happens...");
            RPG.chooseAction(character, monster);
        }
        monster.setHealthPoints(monster.getHealthPoints() - ((character.getIntelligence() * 10 / character.getStrength()) + 5));
        character.setManaPoints(character.getManaPoints() - 10);
        System.out.printf("%s's HP: %d\n", monster.getName(), monster.getHealthPoints());
        RPG.chooseAction(character, monster);
    }

    // The section below contains boilerplate code like the constructor and all the getters and setters
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

    protected void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    protected int getManaPoints() {
        return manaPoints;
    }

    protected void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    protected int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    protected int getExperiencePoints() {
        return experiencePoints;
    }

    protected void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    protected int getStrength() {
        return strength;
    }

    protected void setStrength(int strength) {
        this.strength = strength;
    }

    protected int getDexterity() {
        return dexterity;
    }

    protected void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    protected int getIntelligence() {
        return intelligence;
    }

    protected void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
