package dwolf.random;

import java.util.Arrays;
import java.util.Random;

/**
 * ~~Class description~~
 * This class generates a new random number of a user-given length.
 * In the process, System.nanoTime is utilized to generate a pseudo-random number as a string.
 * The random number's length must not exceed a length of 10, since longer numbers would lack uniqueness.
 */


public class random_random_class {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Double: " + random.nextDouble());
        System.out.println("Boolean: " + random.nextBoolean());
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        // Print the byte array as a string
        System.out.println("Byte Array: " + Arrays.toString(bytes));
    }
}
