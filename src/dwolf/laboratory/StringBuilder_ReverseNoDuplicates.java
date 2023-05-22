package dwolf.laboratory;

public class StringBuilder_ReverseNoDuplicates {
    static long num = 8852332509400L;
    static StringBuilder str;
    static StringBuilder code;

    public static void main(String[] args) {
        byIndexOf();
        byDeleteCharAt();
    }

    private static void byIndexOf() {
        str = new StringBuilder(Long.toString(num));
        code = new StringBuilder();
        str.reverse(); // 0049052332588

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '0' && code.length() < 1) &&
                    code.indexOf(Character.toString(str.charAt(i))) == -1) {

                code.append(str.charAt(i));
            }
        }
        System.out.println("byIndexOf: " + code);
    }

    private static void byDeleteCharAt() {
        str = new StringBuilder(Long.toString(num));
        str.reverse(); // 0049052332588

        while (str.charAt(0) == '0') {
            str.delete(0, 1);
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str.deleteCharAt(j);
                }
            }
        }
        System.out.println("byDeleteCharAt: " + str);
    }

}