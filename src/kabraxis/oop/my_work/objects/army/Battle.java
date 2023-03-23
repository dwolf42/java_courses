package kabraxis.oop.my_work.objects.army;

class Battle {
    public static void fight(Knight knight, Goblin goblin) {
        System.out.printf("Knight start HP: %d%nGoblin start HP: %d%n%n",
                knight.getHitPoints(), goblin.getHitPoints());

        int hpBeforeHit;
        while (knight.getHitPoints() > 0 || goblin.getHitPoints() > 0) {
            // Goblin attack
            if (Randomizer.intZeroMax() % 100 > goblin.getStrength()) {
                hpBeforeHit = knight.getHitPoints();
                knight.setHitPoints(knight.getHitPoints() - (Damage.dmg(goblin.getStrength())));
                System.out.printf("Knight got hit for: %d DMG%n",
                        (hpBeforeHit - knight.getHitPoints()));

                if (knight.getHitPoints() <= 0) {
                    System.out.printf("Goblin wins!%nGoblin remaining HP: %d",
                            goblin.getHitPoints());
                    break;
                }
            } else {
                System.out.println("Goblin missed!");
            }

            // Knight attack
            if (Randomizer.intZeroMax() % 100 > knight.getStrength()) {
                hpBeforeHit = goblin.getHitPoints();
                goblin.setHitPoints(goblin.getHitPoints() - (Damage.dmg((knight.getStrength()))));
                System.out.printf("Goblin got hit for: %d DMG%n",
                        (hpBeforeHit - goblin.getHitPoints()));

                if (goblin.getHitPoints() <= 0) {
                    System.out.printf("Knight wins!%nKnight remaining HP: %d",
                            knight.getHitPoints());
                    break;
                }
            } else {
                System.out.println("Knight missed!");
            }
        }
    }
}
