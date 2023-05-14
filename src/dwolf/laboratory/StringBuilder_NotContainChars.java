package dwolf.laboratory;

public class StringBuilder_NotContainChars {
    public static void main(String[] args) {
        long num = 8852332509400L;

        StringBuilder str = new StringBuilder(Long.toString(num));
        StringBuilder code = new StringBuilder();
        str.reverse(); // 0049052332588

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' && code.length() < 1) {
                continue;
            }
            if (code.indexOf(Character.toString(str.charAt(i))) == -1) {
                code.append(str.charAt(i));
            }

        }
        System.out.println(code);
    }

}