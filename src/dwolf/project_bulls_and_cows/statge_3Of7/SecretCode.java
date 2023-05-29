package dwolf.project_bulls_and_cows.statge_3Of7;

public class SecretCode {
    private int codeGivenSize;

    public String generateSecretCode(int codeGivenSize) {
        this.codeGivenSize = codeGivenSize;

        while (this.codeGivenSize > 10) {
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough" +
                    " unique digits.");
            this.codeGivenSize = Integer.parseInt(Main.getInput());
        }

        StringBuilder randomCode = createCode();

        while (randomCode.length() != this.codeGivenSize) {
            adjustCodeLength(randomCode);
        }


        return randomCode.toString();
    }

    private StringBuilder createCode() {
        StringBuilder code = new StringBuilder(getPseudoRandomNumber());

        reverseCode(code);
        deleteLeadingZero(code);
        deleteDuplicates(code);

        return code;
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

    private void adjustCodeLength(StringBuilder generatedCode) {
        if (generatedCode.length() > codeGivenSize) {
            shortenCode(generatedCode);
        } else {
            extendCode(generatedCode);
        }
    }

    private void shortenCode(StringBuilder generatedCode) {
        generatedCode.delete(codeGivenSize, generatedCode.length());
    }


    private void extendCode(StringBuilder generatedCode) {
        StringBuilder spareRandomCode = new StringBuilder(getPseudoRandomNumber());
        reverseCode(spareRandomCode);
        generatedCode.append(spareRandomCode);
        deleteDuplicates(spareRandomCode);
    }

    private String getPseudoRandomNumber() {
        String rnd = Long.toString(System.nanoTime());
        System.out.println("rnd: " + rnd);
        return rnd;
    }

}
