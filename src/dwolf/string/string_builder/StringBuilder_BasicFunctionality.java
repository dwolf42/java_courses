package dwolf.string.string_builder;

public class StringBuilder_BasicFunctionality {
    public static void main(String[] args) {
        // Empty string
        StringBuilder empty = new StringBuilder();
        System.out.println(empty);

        // Pass string to it
        StringBuilder str1 = new StringBuilder("Hello!");
        System.out.println(str1); // "Hello!"

        // int length() - does not modify the object
        StringBuilder str2 = new StringBuilder("I use Java");
        System.out.println(str2.length()); // 10

        // char chatAt(int index) - does not modify the object
        StringBuilder str3 = new StringBuilder("I use Java");
        System.out.println(str3.charAt(0)); // 'I'
        System.out.println(str3.charAt(6)); // 'J'

        // void setCharAt(int index, char ch) sets a character located at the specified index to ch
        StringBuilder str4 = new StringBuilder("start");
        str4.setCharAt(1, 'm');
        System.out.println(str4); // "smart"

        // StringBuilder deleteCharAt(int index) removes the character at the specified position.
        StringBuilder str5 = new StringBuilder("dessert");
        str5.deleteCharAt(2);
        System.out.println(str5); // "desert"

        // StringBuilder append(String str) concatenates the given string to the end of
        // There are also several overloadings for primitive types and even arrays of characters.
        StringBuilder str6 = new StringBuilder("abc");
        str6.append("123");
        System.out.println(str6); // "abc123"

        // It is also possible to invoke this method multiple times on the same object in the same statement because
        // this method returns the same modified object.
        StringBuilder str62 = new StringBuilder(); // empty

        str62
                .append("From: Kate@gmail.com\n")
                .append("To: Max@gmail.com\n")
                .append("Text: I lost my keys.\n")
                .append("Please, open the door!");

        System.out.println(str62);

        // StringBuilder insert(int offset, String str) inserts the given string into the existing StringBuilder object
        // at the position indicated by the offset. Method has a lot of overloadings for different types.
        StringBuilder str7 = new StringBuilder("I'm a programmer.");
        str7.insert(6, "Java ");
        System.out.println(str7); // "I'm a Java programmer."
        // As index 6 would be 'p', I assume "offset" means something like "do not replace the letter, move it one to
        // the right instead, before inserting".

        // StringBuilder replace(int start, int end, String str) replaces the substring from the specified string index
        // (inclusive) to the end index (exclusive) with a given string.
        StringBuilder str8 = new StringBuilder("Let's use C#");
        str8.replace(10, 12, "Java");
        System.out.println(str8); // "Let's use Java"

        // StringBuilder delete(int start, int end) removes the substring from the start index (inclusive) to
        // the end index (exclusive).
        StringBuilder str9 = new StringBuilder("Welcome");
        str9.delete(0, 3);
        System.out.println(str9); // "come"

        // StringBuilder reverse() causes this character sequence to be replaced by the reverse of the sequence.
        // Nice for palindromes!
        StringBuilder str10 = new StringBuilder("2 * 3 + 8 * 4");
        str10.reverse();
        System.out.println(str10);

        // Palindrome example
        String palindrome = "Dot saw I was Tod";
        StringBuilder str102 = new StringBuilder(palindrome);
        str102.reverse();
        System.out.println(str102);

        // StringBuilder object to String
        StringBuilder str11 = new StringBuilder("Make me a String!");
        String str12 = str11.toString();
        System.out.println(str12);

        // Don't confuse: length and capacity. The length returns the actual number of characters,
        // capacity returns the amount of storage available for newly inserted characters, beyond which an allocation
        // will occur. The capacity is a part of the internal representation of StringBuilder,
        // and its value will dynamically change.
        StringBuilder str13 = new StringBuilder(); // initial capacity is 16
        System.out.println(str13.length());   // 0
        System.out.println(str13.capacity()); // 16
        str13.append("A very long string");
        // As soon as the elements of the string exceed the capacity it will be increased.

        // StringBuilder object may be created with specified capacity, but it is not used very often.
        StringBuilder str14 = new StringBuilder(30);
        System.out.println(str14.length());   // 0
        System.out.println(str14.capacity()); // 30
    }
}