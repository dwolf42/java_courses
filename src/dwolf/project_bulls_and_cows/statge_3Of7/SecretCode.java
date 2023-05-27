package dwolf.project_bulls_and_cows.statge_3Of7;

public class SecretCode {
    private int codeGivenLength;
    private StringBuilder randomCode;
    private StringBuilder spareRandomCode;

    public String getNewSecretCode() {
        setCodeGivenLength();
        randomCode = new StringBuilder(getPseudoRandomNumber());
        reverseCode(randomCode);
        deleteLeadingZero(randomCode);
        deleteDuplicates(randomCode);

        // In case the code is too long
        if (randomCode.length() > getCodeGivenLength()) {
            shortenCode(randomCode);
        }

        // In case the code is too short
        if (randomCode.length() < getCodeGivenLength()) {
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
        generatedCode.delete(getCodeGivenLength(), generatedCode .length());
        System.out.println("post shorten code to fit codeGivenLength: " + generatedCode);
    }

    private void extendCode(StringBuilder randomCode) {
        int extendFor = getCodeGivenLength() - randomCode.length();
        spareRandomCode = new StringBuilder(getPseudoRandomNumber());
        spareRandomCode.reverse();
    }

    private void setCodeGivenLength() {
        codeGivenLength = Integer.parseInt(Main.getInput());
    }

    private int getCodeGivenLength() {
        return codeGivenLength;
    }

    private String getPseudoRandomNumber() {
//        return Long.toString(System.nanoTime());
        return Long.toString(112233L);
    }

}
