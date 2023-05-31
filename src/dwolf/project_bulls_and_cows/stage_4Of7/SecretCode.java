package dwolf.project_bulls_and_cows.stage_4Of7;

/**
 * ~~Class description~~
 * This class has the task of generating a new secret code of a user-given length, which than has to be guessed in the
 * Bulls and Cows game. In the process, System.nanoTime is utilized to generate a pseudo-random number as a string.
 * The secret code's length must not exceed a length of 10, since longer numbers would lack uniqueness of numbers.
 * The code written here is a pre-requirement for the further game development. For further detail, please read
 * the task description.
 * <p>
 * <p>
 * ~~Task description~~
 * In this stage, you should combine all the previous parts into a simple playable version of the "Bulls and Cows" game.
 * First, prompt the player to input the length of the secret code. The length will determine the difficulty level for
 * the current game session. The program should generate a secret code of the given length. Remember that it should
 * consist of unique numbers.
 * <p>
 * Then, the game starts and the program prompts the player to guess the code. When the player inputs a number, the
 * program should grade it in bulls and cows. The game goes on until the code is guessed, that is, until the number of
 * bulls is equal to the number of digits in the code. When the game ends, the program should finish its execution.
 * <p>
 * <p>
 * ~~Objective~~
 * In this stage, your program should:
 * 1. Ask for the length of the secret code and then generate the code.
 * 2. Wait for the user input.
 * 3. Grade the guessing attempt in bulls and cows.
 * 4. If the secret code has been guessed, the program stops; otherwise, return to the second step.
 * <p>
 * <p>
 * ~~Examples~~
 * Please, enter the secret code's length:
 * > 4
 * Okay, let's start a game!
 * Turn 1:
 * > 1234
 * Grade: 1 bull and 1 cow
 * Turn 2:
 * > 7354
 * Grade: 2 bulls and 1 cow
 * Turn 3:
 * > 9374
 * Grade: 4 bulls
 * Congratulations! You guessed the secret code.
 */

class SecretCode {
    private int codeGivenSize;

    // Create getSecretCode and createCode are separated from each other to maintain re-usability.
    // This way, adjustCodeLength can be utilized createCode to generate an additional secret code,
    // if the first one is too small.
    public String getSecretCode(int codeGivenSize) {
        this.codeGivenSize = codeGivenSize;

        while (this.codeGivenSize > 10) {
            System.out.printf("\nError: can't generate a secret number with a length of %d because " +
                    "there aren't enough unique digits.", codeGivenSize);

            this.codeGivenSize = Integer.parseInt(Main.getInput());
        }

        StringBuilder randomCode = createCode();

        while (randomCode.length() != this.codeGivenSize) {
            adjustCodeLength(randomCode);
        }

        return randomCode.toString();
    }

    // Creates a new secret code which will be customized as the task requests.
    // Code length is not affected, so there are more digits to choose if a second code for spare numbers is needed.
    private StringBuilder createCode() {
        StringBuilder code = new StringBuilder(getPseudoRandomNumberString());

        reverseCode(code);
        deleteLeadingZero(code);
        deleteDuplicates(code);

        return code;
    }

    public void reverseCode(StringBuilder generatedCode) {
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
