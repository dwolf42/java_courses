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

    public void reverseCode(StringBuilder randomCode) {
        System.out.println("pre reverse " + randomCode);
        randomCode.reverse();
        System.out.println("post reverse " + randomCode);
    }

    // Is the first digit of the number a zero? It will be deleted.
    private void deleteLeadingZero(StringBuilder randomCode) {
        while (randomCode.charAt(0) == '0') {
            randomCode.delete(0, 1);
        }
        System.out.println("post delete leading zero/s: " + randomCode);
    }

    private void deleteDuplicates(StringBuilder randomCode) {
        for (int i = 0; i < randomCode.length(); i++) {
            for (int j = i + 1; j < randomCode.length(); j++) {
                if (randomCode.charAt(i) == randomCode.charAt(j)) {
                    randomCode.deleteCharAt(j);
                }
            }
        }

        System.out.println("post duplicates elimination: " + randomCode);
    }

    private void shortenCode(StringBuilder randomCode) {
        randomCode.delete(getCodeGivenLength(), randomCode.length());
        System.out.println("post shorten code to fit codeGivenLength: " + randomCode);
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
