package dwolf.project_bulls_and_cows.statge_3Of7;

public class SecretCode {
    private int codeGivenSize;

    public String getSecretCode(int codeGivenSize) {
        this.codeGivenSize = codeGivenSize;

        while (this.codeGivenSize > 10) {
            System.out.printf("\nError: can't generate a secret number with a length of %d because " +
                    "there aren't enough unique digits.", codeGivenSize);

            this.codeGivenSize = Integer.parseInt(Main.getInput());
        }

        StringBuilder randomCode = createCode();

        while (randomCode.length() != this.codeGivenSize) {
            adjustCodeLength(randomCode);
        }

        return randomCode.toString();
    }

    private StringBuilder createCode() {
        StringBuilder code = new StringBuilder(getPseudoRandomNumberString());

        reverseCode(code);
        deleteLeadingZero(code);
        deleteDuplicates(code);

        return code;
    }

    public void reverseCode(StringBuilder generatedCode) {
        generatedCode.reverse();
    }

    private void deleteLeadingZero(StringBuilder generatedCode) {
        while (generatedCode.charAt(0) == '0') {
            generatedCode.delete(0, 1);
        }
    }

    private void deleteDuplicates(StringBuilder generatedCode) {
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
        StringBuilder spareRandomCode = createCode();
        generatedCode.append(spareRandomCode);
        deleteDuplicates(generatedCode);
    }

    private String getPseudoRandomNumberString() {
        return Long.toString(System.nanoTime());
    }

}
