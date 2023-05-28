package dwolf.project_bulls_and_cows.statge_3Of7;

public class SecretCode {
    private int codeGivenSize;
    private StringBuilder randomCode;
    private StringBuilder spareRandomCode;

    public String getNewSecretCode() {
        setCodeGivenSize();
        randomCode = new StringBuilder(getPseudoRandomNumber());
        reverseCode(randomCode);
        deleteLeadingZero(randomCode);
        deleteDuplicates(randomCode);

        // In case the code is too long
        if (randomCode.length() > getCodeGivenSize()) {
            shortenCode(randomCode);
        }

        // In case the code is too short
        while (randomCode.length() < getCodeGivenSize()) {
            extendCode(randomCode);
        }

        return randomCode.toString();
    }

    public void reverseCode(StringBuilder generatedCode) {
        System.out.println("pre reverse " + generatedCode);
        generatedCode.reverse();
        System.out.println("post reverse " + generatedCode);
    }

    // Is the first digit of the number a zero? It will be deleted.
    private void deleteLeadingZero(StringBuilder generatedCode) {
        while (generatedCode.charAt(0) == '0') {
            generatedCode.delete(0, 1);
        }
        System.out.println("post delete leading zero/s: " + generatedCode);
    }

    // deleteDuplicates and the for-loop in extendCode are both checking if the StringBuilder contains the character
    private void deleteDuplicates(StringBuilder generatedCode) {
        for (int i = 0; i < generatedCode.length(); i++) {
            for (int j = i + 1; j < generatedCode.length(); j++) {
                if (generatedCode.charAt(i) == generatedCode.charAt(j)) {
                    generatedCode.deleteCharAt(j);
                }
            }
        }

        System.out.println("post duplicates elimination: " + generatedCode);
    }

    private void shortenCode(StringBuilder generatedCode) {
        generatedCode.delete(getCodeGivenSize(), generatedCode.length());
        System.out.println("post shorten code to fit codeGivenSize: " + generatedCode);
    }

    // the for-loop in extendCode and deleteDuplicates are both checking if the StringBuilder contains the character
    private void extendCode(StringBuilder generatedCode) {
        System.out.println("Runs extendCode");
        int extendFor = getCodeGivenSize() - generatedCode.length();
        spareRandomCode = new StringBuilder(getPseudoRandomNumber());
        reverseCode(spareRandomCode);
        for (int i = 0; i < spareRandomCode.length(); i++) {
            if (!generatedCode.toString().contains(Character.toString(spareRandomCode.charAt(i)))) {
                generatedCode.append(spareRandomCode.charAt(i));
                extendFor--;
            }
            if (extendFor < 1) {
                break;
            }
        }

    }

    private void setCodeGivenSize() {
        codeGivenSize = Integer.parseInt(Main.getInput());
        while (codeGivenSize > 10) {
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough" +
                    " unique digits.");
            codeGivenSize = Integer.parseInt(Main.getInput());
        }
    }

    private int getCodeGivenSize() {
        return codeGivenSize;
    }

    private String getPseudoRandomNumber() {
        return Long.toString(System.nanoTime());
    }

}
