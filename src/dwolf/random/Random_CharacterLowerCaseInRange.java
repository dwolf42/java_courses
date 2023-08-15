package dwolf.random;

import java.util.Random;

public class Random_CharacterLowerCaseInRange {

    public static void main(String[] args) {
        int upper = 107;
        int lower = 97;

        for (int i = 0; i < 10; i++) {
            System.out.println(randomCharacterInRange(upper, lower));
        }
    }

    // Including boundary
    // ASCII representation of a - z is 97 - 122, which will be cast to char.
    // The random number I receive from Random is always from 0-10.
    // When I receive 4 the lower value will be added, which is 101.
    // By adding the lower boundary, I can never get a smaller value than lower!
    public static char randomCharacterInRange(int upper, int lower) {
        return (char)(new Random().nextInt(upper - lower + 1) + lower);
    }
}
