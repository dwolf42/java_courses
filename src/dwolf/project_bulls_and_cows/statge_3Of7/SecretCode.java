package dwolf.project_bulls_and_cows.statge_3Of7;

public class SecretCode {
    private int codeGivenSize;
    private StringBuilder spareRandomCode;

    public String generateSecretCode(int codeGivenSize) {
        setCodeGivenSize();
        StringBuilder randomCode = new StringBuilder(getPseudoRandomNumber());
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
        generatedCode.reverse();
    }

    // Is the first digit of the number a zero? It will be deleted.
    private void deleteLeadingZero(StringBuilder generatedCode) {
        while (generatedCode.charAt(0) == '0') {
            generatedCode.delete(0, 1);
        }
    }

    // eliminate duplicate digits
    private void deleteDuplicates(StringBuilder generatedCode) {
        System.out.println("length: " + generatedCode.length());
        for (int i = 0; i < generatedCode.length(); i++) {
            for (int j = generatedCode.length() - 1; j > i; j--) {
                if (generatedCode.charAt(i) == generatedCode.charAt(j)) {
                    generatedCode.deleteCharAt(j);
                }
            }
        }
    }

    private void shortenCode(StringBuilder generatedCode) {
        generatedCode.delete(getCodeGivenSize(), generatedCode.length());
    }


    private void extendCode(StringBuilder generatedCode) {
        spareRandomCode = new StringBuilder(getPseudoRandomNumber());
        reverseCode(spareRandomCode);
        generatedCode.append(spareRandomCode);
        deleteDuplicates(spareRandomCode);
        // In case the code is too long
        if (generatedCode.length() > getCodeGivenSize()) {
            shortenCode(generatedCode);
        }
    }

    private void setCodeGivenSize() {
        //Test
//        codeGivenSize = Integer.parseInt(Main.getInput());
        codeGivenSize = 5;
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
        String rnd = Long.toString(System.nanoTime());
        System.out.println("rnd: " + rnd);
        return rnd;
    }

}
