package kabraxis.oop.my_work.objects.army;

class Main {
    public static void main(String[] args) {
        Knight sirWolf = new Knight(100, 20);
        Goblin cheekyGoblin = new Goblin(50, 10);

        Battle.fight(sirWolf, cheekyGoblin);
    }
}
