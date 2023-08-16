package dwolf.project_bulls_and_cows.stage_6Of7;

import java.util.Scanner;

public class Engine {
    // Game starts at turn 1
    static int turn = 1;

    // The amount of bulls and cows are stored in an array. These are the indices that describe where in animalFold[]
    // the corresponding values are stored.
    static final int indexBulls = 0;
    static final int indexCows = 1;

    // How many bulls are required to win is determined by the length of the code the user wants to guess.
    static int codeLength;
    static int codeComplexity;
    static String secretCode;
    static SecretCodeGenerator scg;

    public Engine() {
        scg = new SecretCodeGenerator();
    }

    public void startGame() {
        codeLength = askCodeLength();
        codeComplexity = askCodeComplexity();
        secretCode = scg.getSecretCode(codeLength, codeComplexity);

        System.out.print("The secret code is prepared: ");

        for(int i = 0; i < codeLength; i++) {
            System.out.print("*");
        }

        System.out.println(codeComplexity < 11 ? " (0-9)" : " (0-9, " + scg.getAlphanumeric()[10] + "-" +
                scg.getAlphanumeric()[codeComplexity - 1] + ").");
        System.out.println("Okay, let's start a game!");

        play();
    }
    protected static int askCodeLength() {
        System.out.println("Input the length of the secret code:");
        return Integer.parseInt(getInput());
    }
    // Starts the game, by getting a new secret code and setting win condition.
    protected static int askCodeComplexity() {
        System.out.println("Input the number of possible symbols in the code:");

        int complexity = Integer.parseInt(getInput());

        while (complexity > 36) {
            System.out.println("Error: can't generate a secret with a length above 36 because there aren't enough" +
                    " unique characters.");
            System.out.println("Please enter a number not greater than 36.");
            System.out.println("Input the number of possible symbols in the code:");
            complexity = Integer.parseInt(getInput());
        }

        return complexity;
    }

    // Manages the game logic. Generated secret code, and the users guess are pre-processed here, before Grader()
    // evaluates these against each other.
    // This method could have been broken down further, but I wanted to keep things simple.
    // TODO: run() is way to big, complex, and has too many responsibilities. It must be broken down.
    //  Also the method is lacking testability.
    protected static void play() {

        System.out.printf("Turn %d: \n",
                turn);

        // Evaluation of secret code vs. guess is done by string processing, which I found easier to implement.
        char[] secret = secretCode.toCharArray();
        char[] guess = getInput().toCharArray();

        // Anonymous object, since it's only used here.
        // animalFold[] is where the code saves how many bulls and cows are correctly guessed.
        int[] animalFold = new Grader().countCows(secret, guess);

        if (animalFold[indexBulls] == codeLength) {
            System.out.printf("Grade: %d bulls.\nCongrats! The secret code is %s.",
                    animalFold[indexBulls], secretCode);
        } else {
            if (animalFold[indexBulls] == 0 && animalFold[indexCows] == 0) {
                System.out.println("Grade: None.");
                turn++;
                play();
            } else {
                // I decided to use switch statement, for the sake of code clarity. Too may if-statements would
                // clutter code and make it harder to read.
                switch (animalFold[indexBulls]) {
                    case 0:
                        System.out.printf("Grade: %d cow(s).\n",
                                animalFold[indexCows]);
                        turn++;
                        play();
                        break;
                    default:
                        System.out.printf("Grade: %d bull(s) %d cow(s).\n",
                                animalFold[indexBulls], animalFold[indexCows]);
                        turn++;
                        play();
                        break;
                }
            }
        }
    }

    // I wanted to have only one method responsible to get user input. As the whole evaluation of the secret code vs.
    // guessed code is done by string processing, all inputs are taken as string.
    // WARNING: There is no input safety, in order to save time by focusing on the main task objectives.
    protected static String getInput() {
        return new Scanner(System.in).nextLine();
    }
}
