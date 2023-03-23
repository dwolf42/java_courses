package kabraxis.oop.my_work.objects.army;

class Goblin {
    private int hitPoints;
    private int strength;

    public Goblin (int hitPoints, int strength) {
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
