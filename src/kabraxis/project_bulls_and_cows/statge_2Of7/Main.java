package kabraxis.project_bulls_and_cows.statge_2Of7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    protected static void run() {
        final int indexBulls = 0;
        final int indexCows = 1;
        final int winBulls = 4;
        int turn = 1;
        Scanner scanner = new Scanner(System.in);
//        String secret = scanner.nextLine();
        String secretINP = "9305";
        char[] secret = secretINP.toCharArray();
        System.out.println("The secret code is prepared: ****.");
        System.out.printf("\nTurn %d. Answer: \n", turn);
//        String input = scanner.nextLine();
        String guessINP = "9955";
        System.out.println(guessINP);
        char[] guess = guessINP.toCharArray();
        Grader grade = new Grader();
        int[] animalFold = grade.countCows(secret, guess);
        if (animalFold[indexBulls] == winBulls) {
            System.out.printf("Grade: %d bulls.\nCongrats! The secret code is %s.", animalFold[indexBulls], secretINP);
        } else {
            // TODO: implement turn increase + message
            switch(animalFold[indexBulls]) {
                case 0:
                    System.out.printf("Grade: %d cow(s)", animalFold[indexCows]);
                    break;
                default:
                    System.out.printf("Grade: %d bull(s) %d cow(s)", animalFold[indexBulls], animalFold[indexCows]);
                    break;
            }

            /*
            if bulls == 0
            if bulls < 4
            if bulls == 1
            */
        }


    }

}


/*
Description
Let's add some interactivity to our program. The program should create a 4-digit secret code, and the player should try
to guess it on the first try. The program should give a grade to evaluate how accurate the player was.

As you remember, a correctly guessed digit is a cow, and if its position is also correct, then it is a bull. After the
player tries to guess the secret code, the program should grade the attempt and finish the execution.

For example, if the secret code is 9305, then:

The number 9305 contains 4 bulls and 0 cows since all 4 digits are correct and their positions are correct as well.
It's the only number that can contain 4 bulls, so it's also the secret code itself.

The numbers 3059, 3590, 5930, 5039 contain 0 bulls and 4 cows since all 4 digits are correct but their positions don't
match the positions in the secret code.

The numbers 9306, 9385, 9505, 1305 contain 3 bulls.
The numbers 9350, 9035, 5309, 3905 contain 2 bulls and 2 cows.
The numbers 1293, 5012, 3512, 5129 contain 0 bulls and 2 cows.
The numbers 1246, 7184, 4862, 2718 contain 0 bulls and 0 cows.
Note that guesses can contain repetitive digits, so:

The number 1111 contains 0 bulls and 0 cows.
The number 9999 contains 1 bull and 3 cows.
The number 9955 contains 2 bulls and 2 cows.
Objectives
In this stage, your goal is to write the core part of the game: the grader.

Your program should take a 4-digit number as an input.
Use a predefined 4-digit code and grade the answer that was input. You can do it digit by digit.
The grade is considered correct if it contains number-and-word pairs (like X bulls and Y cows) that give the correct
information. If the answer doesn't contain any bulls and cows, you should output None.

Examples
The greater-than symbol followed by a space > represents the user input. Note that it's not part of the input.

Example 1

> 1234
Grade: 1 cow(s). The secret code is 9305.
Example 2

> 9087
Grade: 1 bull(s) and 1 cow(s). The secret code is 9305.
Example 3

> 1267
Grade: None. The secret code is 9305.

*/