import java.util.Scanner;

public class ArrayForLoop_LongestAscendingSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int longestSequence = 0;
        int indexOnSave = 0;
        int sequenceToPrint = 0;
        //int indexOnSaveToPrint = 0;

        int[] arrayForInput = new int[defineLength];
        int[] saveLongestSequence = new int[defineLength];

        for (int i = 0; i < arrayForInput.length; i++) {
            arrayForInput[i] = scanner.nextInt();
        }

        for (int j = 0; j < arrayForInput.length; j++) {

            for (int k = 1; k < arrayForInput.length; k++) {

                if (arrayForInput[k] > arrayForInput[k - 1]) {
                    saveLongestSequence[j]++;
                } else {
                    break;
/*                } else {
                 saveLongestSequence[indexOnSave] = longestSequence;
                 indexOnSave++;
                 longestSequence = 1;
                }
*/
                }
            }
        }

        for (int l = 0; l < saveLongestSequence.length; l++) {

            if (saveLongestSequence[l] > sequenceToPrint) {
                sequenceToPrint = saveLongestSequence[l];
            }
        }

/*
            if (saveLongestSequence[l] > saveLongestSequence[l - 1]) {
                indexOnSaveToPrint = l;
            }
        }
        if (saveLongestSequence[indexOnSaveToPrint] > saveLongestSequence[0]) {
            System.out.println(saveLongestSequence[indexOnSaveToPrint]);
        } else {
            System.out.println(saveLongestSequence[0]);
*/
/*        }

        if (sequenceToPrint > longestSequence) {
            System.out.println(sequenceToPrint);
        } else {
            System.out.println(longestSequence);
        }
*/
        System.out.println(sequenceToPrint);
    }
}