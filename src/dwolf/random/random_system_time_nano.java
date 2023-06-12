package dwolf.random;

import java.util.Scanner;


/**
 * ~~Class description~~
 * This class generates a new random number of a user-given length.
 * In the process, System.nanoTime is utilized to generate a pseudo-random number as a string.
 * The random number's length must not exceed a length of 10, since longer numbers would lack uniqueness.
 */

class random_system_time_nano {
    private int codeGivenSize;

    // Create getSecretCode and createCode are separated from each other to maintain re-usability.
    protected int getSecretCode(int codeGivenSize) {
        this.codeGivenSize = codeGivenSize;

        while (this.codeGivenSize > 10) {
            System.out.printf("Error: can't generate a random number with a length of %d because " +
                    "there aren't enough unique digits.\n", codeGivenSize);

            this.codeGivenSize = new Scanner(System.in).nextInt();
        }

        StringBuilder randomCode = createCode();

        while (randomCode.length() != this.codeGivenSize) {
            adjustCodeLength(randomCode);
        }

        return Integer.parseInt(randomCode.toString());
    }

    // Creates a new random number which will be customized.
    // Code length is not affected, so there are more digits to choose if a second code for spare numbers is needed.
    private StringBuilder createCode() {
        StringBuilder code = new StringBuilder(getPseudoRandomNumberString());

        reverseCode(code);
        deleteLeadingZero(code);
        deleteDuplicates(code);

        return code;
    }

    private void reverseCode(StringBuilder generatedCode) {
        generatedCode.reverse();
    }

    private void deleteLeadingZero(StringBuilder generatedCode) {
        while (generatedCode.charAt(0) == '0') {
            generatedCode.delete(0, 1);
        }
    }

    // Inner loop compares all the other characters to the character of the outer loop.
    // It runs backwards to prevent skipping indices after deletion.
    private void deleteDuplicates(StringBuilder generatedCode) {
        for (int i = 0; i < generatedCode.length(); i++) {
            for (int j = generatedCode.length() - 1; j > i; j--) {
                if (generatedCode.charAt(i) == generatedCode.charAt(j)) {
                    generatedCode.deleteCharAt(j);
                }
            }
        }
    }

    private void adjustCodeLength(StringBuilder generatedCode) {
        if (generatedCode.length() > codeGivenSize) {
            shortenCode(generatedCode);
        } else {
            extendCode(generatedCode);
        }
    }

    private void shortenCode(StringBuilder generatedCode) {
        generatedCode.delete(codeGivenSize, generatedCode.length());
    }

    private void extendCode(StringBuilder generatedCode) {
        StringBuilder spareRandomCode = createCode();
        generatedCode.append(spareRandomCode);
        deleteDuplicates(generatedCode);
    }

    private String getPseudoRandomNumberString() {
        return Long.toString(System.nanoTime());
    }

}
