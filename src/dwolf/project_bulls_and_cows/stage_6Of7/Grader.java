package dwolf.project_bulls_and_cows.stage_6Of7;

/**
 *  * ~~Class description~~
 * Secret code vs. guessed code comparison.
 */
class Grader {

    private int bulls;
    private int cows;

    // A bull is, if the guessed character is equal and at the same position as in the secret code.
    // Whereas a cow is, if the guessed character is part of the secret code, but only at the wrong place.
    protected void gradeGuess(String secretCode, String guess) {
        // Reset bulls and cows ever guess. This flushes results of previous turn.
        bulls = 0;
        cows = 0;
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

        // Prevent counting bulls as cows
        if (cows >= bulls) {
            cows -= bulls;
        }
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

}