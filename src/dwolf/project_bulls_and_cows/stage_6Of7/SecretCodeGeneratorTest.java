package dwolf.project_bulls_and_cows.stage_6Of7;

import org.junit.jupiter.api.Test;

class SecretCodeGeneratorTest {
    @Test
    void testGetRandomIntFromSeed() {
        final char[] alphanumeric = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};

        SecretCodeGenerator gen = new SecretCodeGenerator();
        // 0 1 2
        for (int i = 0; i < 45; i++) {
            System.out.println(alphanumeric[gen.getRandomIntFromSeed(16)]);
        }
    }

    @Test
    void testGetSecretCode() {
        SecretCodeGenerator gen = new SecretCodeGenerator();
        System.out.println(gen.getSecretCode(4, 11));

    }


}