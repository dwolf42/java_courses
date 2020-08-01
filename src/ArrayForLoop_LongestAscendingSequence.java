import java.util.Scanner;

public class ArrayForLoop_LongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int longestSequence = 0;
        int indexOnSave = 0;
        int indexOnSaveToPrint = 0;

        int[] arrayForInput = new int[defineLength];
        int[] saveLongestSequence = new int[defineLength];

        for (int i = 0; i < arrayForInput.length; i++) {
            arrayForInput[i] = scanner.nextInt();
        }

        for (int j = 1; j < arrayForInput.length; j++) {

            if (arrayForInput[j] > arrayForInput[j - 1]) {
                longestSequence++;
            } else {
                saveLongestSequence[indexOnSave] = longestSequence;
                indexOnSave++;
                longestSequence = 1;
            }
        }

        for (int k = 1; k < saveLongestSequence.length; k++) {

            if (saveLongestSequence[k] > saveLongestSequence[k - 1]) {
                indexOnSaveToPrint = k;
            }
        }
        if (saveLongestSequence[indexOnSaveToPrint] > saveLongestSequence[0]) {
            System.out.println(saveLongestSequence[indexOnSaveToPrint]);
        } else {
            System.out.println(saveLongestSequence[0]);
        }

    }
}

