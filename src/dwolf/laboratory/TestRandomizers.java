package dwolf.laboratory;

import dwolf.oop.my_work.objects.army.Randomizer;

public class TestRandomizers {
    public static void main(String[] args) {
        int iterations = 1000000;
        int atk = 20;
        int normalizer = 100;
        int rnd1;
        int rnd2;
        int rnd3;
        int rnd1Miss = 0;
        int rnd2Miss = 0;
        int rnd3Miss = 0;

        for (int i = 0; i <= iterations; i++) {

            rnd1 = Randomizer.shortIntMax() % normalizer;
            if (rnd1 < atk) {
                rnd1Miss++;
            }

            rnd2 = Randomizer.intMax() % normalizer;
            if (rnd2 < atk) {
                rnd2Miss++;
            }

            rnd3 = Randomizer.intZeroMax() % normalizer;
            if (rnd3 < atk) {
                rnd3Miss++;
            }


            System.out.printf((rnd1 < atk) ? "rnd1: %d miss                " : "rnd1: %d                     ",
                    rnd1);

            System.out.printf((rnd2 < atk) ? "rnd2: %d miss                " : "rnd2: %d                     ",
                    rnd2);

            System.out.printf((rnd3 < atk) ? "rnd3: %d miss                %n" : "rnd3: %d                    %n",
                    rnd3);
        }

        System.out.print("Rnd1 missed: " + rnd1Miss + "               ");
        System.out.print("Rnd2 missed: " + rnd2Miss + "               ");
        System.out.print("Rnd3 missed: " + rnd3Miss + "               ");

        System.out.printf("DMG: %d",
                atk * (80 * 20) / 100);

    }
}