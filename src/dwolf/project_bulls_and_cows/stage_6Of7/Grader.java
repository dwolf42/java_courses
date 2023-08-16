package dwolf.project_bulls_and_cows.stage_6Of7;

/**
 * Secret code vs. guessed code comparison is the only task for this class.
 */
class Grader {

    private int bulls;
    private int cows;


    // A bull is, if the guessed number is at the same position of the generated number.
    // Whereas a cow is, if the guessed number is part of the generated number, but only at the wrong place.
    protected void gradeGuess(String secretCode, String guess) {
        for (int i = 0; i < secretCode.length(); i++) {
            for (int j = 0; j < guess.length(); j++) {
                if (secretCode.charAt(i) == guess.charAt(j) && i == j) {
                    bulls++;
                }
                if (secretCode.charAt(i) == guess.charAt(j)) {
                    cows++;
                }
            }
        }

        // Returns a new array, index 0 equals to bulls, index 1 equals to cows detected in user's guess.
        // The evaluation for cows is: if cows >= bulls, then the value of cows is return cows - bulls, else return
        // the value of cows directly.
        // This is required, so bulls won't get count as cows.
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    protected int[] countCows(char[] secretCode, char[] guess) {
        return new int[]{bulls, cows >= bulls ? cows - bulls : cows};
    }
}