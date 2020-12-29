import java.util.Arrays;

public class String_ProcessingStrings_OrHowToConvertToArrayAndSplitStings {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};


        String stringFromChars = String.valueOf(chars);
        System.out.println("With use of .valueOf(); an array of chars can be converted to a String: " + stringFromChars + '\n');

        char[] charsFromString = stringFromChars.toCharArray();
        System.out.println("By using .toCharArray(); a String can be split into a char array: " + Arrays.toString(charsFromString) + '\n');

        String theSameString = new String(charsFromString);
        System.out.println("If the above created array is used in this objekt it will convert to a string again. " + theSameString + '\n');

        String text = "Hellothere";
        String[] parts = text.split("");
        System.out.println(".splti(); sets a delimiter to determine where the string should be split into an array. " + Arrays.toString(parts) + '\n');

        String sentence = "a long text";
        String[] words = sentence.split(" ");
        System.out.println("This splits the string at its spaces like defined by the delimiter, but, notably, the delimiter itself is not included in any of the substrings: " + words + '\n');

        String number = "+1-213-345-6789";
        String[] parts2 = number.split( "-");
        System.out.println("Here we are splitting the number at the hyphens: " + Arrays.toString(parts2) + '\n');

        String text2 = "That's one small step for a man, one giant leap for mankind.";
        String[] parts3 = text2.split(",");
        System.out.println("This is what happens if you not choose your delimiters wisely: " + Arrays.toString(parts3) + '\n');

        String text3 = "I'm gonna be a programmer";
        String[] parts4 = text3.split(" gonna be ");
        System.out.println("Choose any delimiter you prefer, even a combination of words and spaces: " + Arrays.toString(parts4) + '\n');

        String scientistName = "Isaac Newton";
        System.out.println("Iterating over a string:");
        for (int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) + " ");
        }
        System.out.println();
    }
}