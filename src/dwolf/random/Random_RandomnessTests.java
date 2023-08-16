package dwolf.random;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Random_RandomnessTests {

    @RepeatedTest(1000)
    void testRandomNumberInRange() {
        int result = Random_IntegerInRange.randomNumberInRange(80, 50);
        assertTrue(result >= 50 && result <= 80,
                String.format("Generated number '%d' is out of range.", result));
    }

    @RepeatedTest(1000)
    void testRandomCharacterInRange() {
        char result = Random_CharacterLowerCaseInRange.randomCharacterInRange(107, 97);
        assertTrue(result >= 'a' && result <= 'k',
                String.format("Generated character '%c' is out of range.", result));
    }
}