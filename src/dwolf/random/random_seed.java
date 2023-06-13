package dwolf.random;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * ~~Class description~~
 * This class takes four numbers as input from the user:
 * Start seed (A*), last seed (B*), numbers to generate (N*), range (exclusive) (K*) to generate.
 * The seeds are used to generate random numbers, from 0 - K (exclusive). The maximum of this sequence is saved, and
 * compared afterward with the maximum of the other sequences.
 * Hereafter, the code finds the lowest (minimum) value of all maximum values, and prints it with its
 * corresponding seed.
 * <p>
 * Footnotes marked by (*), please see Task description at the document's end.
 */

class random_seed {
    public static void main(String[] args) {
        int a_SeedStart = 7;
        int b_SeedEnd = 9;
        int totalSeeds = (b_SeedEnd - a_SeedStart) + 1;
        int k_Range = 100;
        int n_Numbers = 4;

        // Holds all seeds from a_SeedStart to b_SeedEnd
        int[] seeds = new int[totalSeeds];
        int[] sequence = new int[n_Numbers];
        int[] maxInSequence = new int[totalSeeds];

        for (int i = 0; i < seeds.length; i++) {
            seeds[i] = a_SeedStart;
            a_SeedStart++;
        }
        a_SeedStart = seeds[0];
        for (int i = 0; i < seeds.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                sequence[j] = new Random(seeds[i]).nextInt(k_Range);

            }
            Arrays.sort(sequence);
            maxInSequence[i] = sequence[sequence.length - 1];
        }

        int smallestValue = maxInSequence[0];
        int smallestIndex = 0;
        for (int i = 0; i < maxInSequence.length; i++) {
            if (maxInSequence[i] < smallestValue) {
                smallestValue = maxInSequence[i];
                smallestIndex = i;
            }
        }
    }
}
/**
 * ~~Task description~~
 * <p>
 * Find the seed
 * <p>
 * Your job is to find the seed between A and B (both inclusive) that produces N pseudorandom numbers from 0 (inclusive)
 * to K (exclusive). It should also have the maximum of these N numbers to be the minimum among all maximums of other
 * seeds in this range.
 * <p>
 * Sounds complicated? Take a look at the example.
 * <p>
 * Here we have A = 7, B = 9, N = 4, K = 100. Let's suppose:
 * <p>
 * For the seed 7, we get the sequence 36, 64, 85, 44 – the maximum is 85.
 * For the seed 8, we get 64, 56, 30, 21 – the maximum is 64.
 * For the seed 9, we get 89, 96, 48, 35 – the maximum is 96.
 * Then the minimum among these maximums is 64. That means, in this example, the seed we are looking for is 8.
 * <p>
 * The input contains numbers A, B, N, K in a single line and in this order.
 * <p>
 * Your task is to output 2 numbers: a seed and its maximum. If there are some seeds with equal minimal maximums,
 * you should output the seed that is smaller than all other seeds.
 * <p>
 * <p>
 * Sample Input:
 * 0 100 5 1000
 * <p>
 * Sample Output:
 * 18
 * 270
 * <p>
 * <p>
 * Sample Input:
 * 0 100 1000 1000
 * <p>
 * Sample Output:
 * 5
 * 993
 * <p>
 * <p>
 * Sample Input:
 * 0 100 10000 1000
 * <p>
 * Sample Output:
 * 0
 * 999
 */