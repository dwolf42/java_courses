package dwolf.laboratory;

public class TestIndexOf {
    public static void main(String[] args) {
        int cows = 0;
        int bulls = 0;

        String secret = "9305";
        String input = "aadsfasf";
        for (int i = 0; i < secret.length(); i++) {
            if (input.indexOf(secret.charAt(i)) != -1) {
                cows++;
            }
        }
    }
}

