package dwolf.project_bulls_and_cows.statge_3Of7;

public class SecretCode {
    private int codeGivenLength;
    private StringBuilder randomCode;

    public String getNewSecretCode() {
        setCodeGivenLength();
        randomCode = new StringBuilder(getPseudoRandomNumber());
        reverseCode();
        deleteLeadingZero();

        // In case the code is too long
        if (randomCode.length() > getCodeGivenLength()) {
            shortenCode();
        }

        return "0";
    }

    public void reverseCode() {
        System.out.println("pre reverse " + randomCode);
        randomCode.reverse();
        System.out.println("post reverse " + randomCode);
    }

    // Is the first digit of the number a zero? It will be deleted.
    private void deleteLeadingZero() {
        while (randomCode.charAt(0) == '0') {
            randomCode.delete(0, 1);
        }
        System.out.println("post delete leading zero/s: " + randomCode);
        deleteDuplicates();
    }

    private void deleteDuplicates() {
        for (int i = 0; i < randomCode.length(); i++) {
            for (int j = i + 1; j < randomCode.length(); j++) {
                if (randomCode.charAt(i) == randomCode.charAt(j)) {
                    randomCode.deleteCharAt(j);
                }
            }
        }

        System.out.println("post duplicates elimination: " + randomCode);
    }

    private void shortenCode() {
        randomCode.delete(getCodeGivenLength(), randomCode.length());
        System.out.println("post shorten code to fit codeGivenLength: " + randomCode);
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
