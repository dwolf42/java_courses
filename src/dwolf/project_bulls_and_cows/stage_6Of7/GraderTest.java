package dwolf.project_bulls_and_cows.stage_6Of7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    public Grader grade;
    @BeforeEach
    public void initialize() {
        grade = new Grader();
    }

    @Test
    void testGradeGuessAllCows() {
        String testSecretCode = "3210";
        String testGuess = "0132";
        grade.gradeGuess(testSecretCode, testGuess);
        int bulls = grade.getBulls();
        int cows = grade.getCows();
        assertTrue(bulls >= 0 && bulls <= testSecretCode.length(),
                String.format("Bulls result '%d' is larger than expected", bulls));
        assertTrue(cows >= 0 && cows <= testSecretCode.length(),
                String.format("Cows result '%d' is larger than expected", cows));
        assertFalse(bulls == testSecretCode.length() && cows > 0,
                String.format("Cows value '%d' is higher than 0 if there are length: '%d' bulls bulls: %d",
                        cows, testSecretCode.length(), bulls));
    }

    @Test
    void testGradeGuessAllBulls() {
        String testSecretCode = "3210";
        String testGuess = "3210";
        grade.gradeGuess(testSecretCode, testGuess);
        int bulls = grade.getBulls();
        int cows = grade.getCows();
        assertTrue(bulls >= 0 && bulls <= testSecretCode.length(),
                String.format("Bulls result '%d' is larger than expected", bulls));
        assertTrue(cows >= 0 && cows <= testSecretCode.length(),
                String.format("Cows result '%d' is larger than expected", cows));
        assertTrue(bulls == testSecretCode.length() && cows > 0,
                String.format("Cows value '%d' is higher than 0 if there are length: '%d' bulls bulls: %d",
                        cows, testSecretCode.length(), bulls));
    }

    @Test
    void testGradeGuessNoHit() {
        String testSecretCode = "3210";
        String testGuess = "7777";
        grade.gradeGuess(testSecretCode, testGuess);
        int bulls = grade.getBulls();
        int cows = grade.getCows();
        assertTrue(bulls >= 0 && bulls <= testSecretCode.length(),
                String.format("Bulls result '%d' is larger than expected", bulls));
        assertTrue(cows >= 0 && cows <= testSecretCode.length(),
                String.format("Cows result '%d' is larger than expected", cows));
        assertFalse(bulls == testSecretCode.length() && cows > 0,
                String.format("Cows value '%d' is higher than 0 if there are length: '%d' bulls bulls: %d",
                        cows, testSecretCode.length(), bulls));
    }

    @Test
    void testGradeGuessOneHitEach() {
        String testSecretCode = "3210";
        String testGuess = "3707";
        grade.gradeGuess(testSecretCode, testGuess);
        int bulls = grade.getBulls();
        int cows = grade.getCows();
        assertTrue(bulls >= 0 && bulls <= testSecretCode.length(),
                String.format("Bulls result '%d' is larger than expected", bulls));
        assertTrue(cows >= 0 && cows <= testSecretCode.length(),
                String.format("Cows result '%d' is larger than expected", cows));
        assertFalse(bulls == testSecretCode.length() && cows > 0,
                String.format("Cows value '%d' is higher than 0 if there are length: '%d' bulls bulls: %d",
                        cows, testSecretCode.length(), bulls));
    }

    @Test
    void testGradeGuessAlphaNumeric() {
        String testSecretCode = "51bc";
        String testGuess = "5100";
        grade.gradeGuess(testSecretCode, testGuess);
        int bulls = grade.getBulls();
        int cows = grade.getCows();
        assertTrue(bulls >= 0 && bulls <= testSecretCode.length(),
                String.format("Bulls result '%d' is larger than expected", bulls));
        assertTrue(cows >= 0 && cows <= testSecretCode.length(),
                String.format("Cows result '%d' is larger than expected", cows));
        assertFalse(bulls == testSecretCode.length() && cows > 0,
                String.format("Cows value '%d' is higher than 0 if there are length: '%d' bulls bulls: %d",
                        cows, testSecretCode.length(), bulls));
    }

    @Test
    void testGradeAmount2() {
        String testSecretCode = "51bc";
        String testGuess = "5100";
        grade.gradeGuess(testSecretCode, testGuess);
        int bulls = grade.getBulls();
        int cows = grade.getCows();
        assertEquals(2, bulls);
        assertEquals(0, cows);
    }

}