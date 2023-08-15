package dwolf.project_bulls_and_cows.stage_6Of7;

import java.util.Random;

/**
 * ~~Class description~~
 * This class has the task of generating a new secret code of a user-given length, which than has to be guessed in the
 * Bulls and Cows game.
 */

class SecretCodeGenerator {

    private final char[] alphanumeric = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private String secretCode = "";

    public String getSecretCode(int codeGivenLength) {

        secretCode = String.valueOf(alphanumeric[getRandomIntFromSeed(codeGivenLength)]);

        while (secretCode.length() != codeGivenLength) {
            int index = getRandomIntFromSeed(codeGivenLength);
            if (!secretCode.contains(String.valueOf(alphanumeric[index]))) {
                secretCode += String.valueOf(alphanumeric[index]);
            }
        }

        return secretCode;
    }

    // Result excludes upper boundary/seed value itself
    public int getRandomIntFromSeed(int seed) {
        return new Random().nextInt(seed);
    }


}
