import java.util.Arrays;

public class String_ProcessingStrings_OrHowToConvertToArray {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};

        String stringFromChars = String.valueOf(chars);
        System.out.println("stringFromChars: " + stringFromChars);

        char[] charsFromString = stringFromChars.toCharArray();
        System.out.println("charsFromString: " + Arrays.toString(charsFromString));

        String theSameString = new String(charsFromString);
        System.out.println("theSameString: " + theSameString);

        String text = "Hello";
        String[] parts = text.split("");
        System.out.println(Arrays.toString(parts));


    }
}