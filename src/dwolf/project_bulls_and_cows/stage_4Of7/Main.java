package dwolf.project_bulls_and_cows.stage_4Of7;

import java.util.Scanner;

/**
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

public class Main {
    static int turn = 1;
    static final int indexBulls = 0;
    static final int indexCows = 1;
    static final int winBulls = 4;
    static String secretINP;

    public static void main(String[] args) {
        run();
    }

    protected static void run() {
        SecretCode newCode = new SecretCode();
        secretINP = newCode.getSecretCode(Integer.parseInt(getInput()));
        char[] secret = secretINP.toCharArray();
        // Getting input from a different method seems to prevent from unwanted prompts for input.
        String guessINP = getInput();
        char[] guess = guessINP.toCharArray();
        Grader grade = new Grader();
        int[] animalFold = grade.countCows(secret, guess);
        if (animalFold[indexBulls] == winBulls) {
            System.out.printf("Grade: %d bulls.\nCongrats! The secret code is %s.",
                    animalFold[indexBulls], secretINP);
        } else {
            if (animalFold[indexBulls] == 0 && animalFold[indexCows] == 0) {
                System.out.printf("Grade: None. The secret code is %s.\n",
                        secretINP);
                turn++;
                run();
            } else {
                // Decided to go for switch statement, for the sake of code clarity. Too may if-statements would
                // clutter code and make it harder to read.
                switch (animalFold[indexBulls]) {
                    case 0:
                        System.out.printf("Grade: %d cow(s). The secret code is %s.\n",
                                animalFold[indexCows], secretINP);
                        turn++;
                        run();
                        break;
                    default:
                        System.out.printf("Grade: %d bull(s) %d cow(s). The secret code is %s.\n",
                                animalFold[indexBulls], animalFold[indexCows], secretINP);
                        turn++;
                        run();
                        break;
                }
            }
        }
    }

    protected static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
/*

- generate pseudo-random secret number of given length - user input must be smaller than 11.
- if length is greater than 10, print warning "Error: can't generate a secret number with a length of 11 because there
  aren't enough unique digits." and do not generate a number.
- use long pseudoRandomNumber = System.nanoTime(); to generate the numbers.
- You can generate a secret code by iterating over the pseudoRandomNumber in the reverse order and adding unique digits.
- If the pseudoRandomNumber lacks the required number of unique digits, call System.nanoTime() again and try to generate
  the secret code again until you get a satisfactory result.
- You can use the Character.getNumericValue(char a) method to get an integer representation of a number!
- code may contain any digits from 0 to 9 only once
- code shouldn't start with a digit 0
 */
