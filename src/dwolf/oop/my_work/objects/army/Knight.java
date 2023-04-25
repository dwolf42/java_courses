package dwolf.oop.my_work.objects.army;

class Knight {
    private int hitPoints;
    private int strength;

    public Knight (int hitPoints, int strength) {
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
