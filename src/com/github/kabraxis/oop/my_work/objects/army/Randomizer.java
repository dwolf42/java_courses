package com.github.kabraxis.oop.my_work.objects.army;

import java.util.Random;

public class Randomizer {
    public static int shortIntMax() {
        int maxRndInt = new Random().nextInt(Integer.MAX_VALUE);
        short minRndShort = (short) new Random().nextInt(Short.MAX_VALUE);
        if (minRndShort > maxRndInt) {
            maxRndInt = minRndShort + 1;
        }
        return new Random().nextInt(((maxRndInt - minRndShort) + 1) + minRndShort);
    }

    public static int intMax() {
        return new Random().nextInt(Integer.MAX_VALUE);

    }

    public static int intZeroMax() {
        return new Random().nextInt(0, Integer.MAX_VALUE);
    }

    public static int dmgRamdom(int strength) {
        return new Random().nextInt(1, strength);
    }

}