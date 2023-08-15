package dwolf.random;

import java.util.Random;

public class Random_IntegerInRange {
    public static void main(String[] args) {

        int upper = 80;
        int lower = 50;
        for (int i = 0; i < 30; i++) {
            System.out.println(randomNumberInRange(upper, lower));
        }

    }
    // Including boundary
    // The random number I receive from Random is always from 0-30.
    // When I receive 4 the lower value will be added, which is 54.
    // By adding the lower boundary, I can never get a smaller value than lower!
    private static int randomNumberInRange(int upper, int lower) {
        return new Random().nextInt(upper - lower + 1) + lower;
    }
}
