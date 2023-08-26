package dwolf.inputoutput.input_streams;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;


public class ExampleCharStream {
    public static void main(String[] args) throws IOException {
        readerToArray();
    }

    public static void readerToArray() throws IOException {
        Reader reader = new FileReader("\\development\\java\\filehandling\\file.txt");

        char first = (char) reader.read(); // i
        char second = (char) reader.read(); // n

        char[] others = new char[12]; // gets filled by reader.read(), as it reads elements up to the capacity of the
        // passed array.
        int numbersOfReadElements = reader.read(others); // this is the number of read elements by reader.read()!
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println(Arrays.toString(others));
        System.out.println(numbersOfReadElements);
    }
    public static void readerWhileLoop() throws IOException {
        Reader reader = new FileReader("\\development\\java\\filehandling\\file.txt");

        int charAsNumber = reader.read();
        while(charAsNumber != -1) {
            char character = (char) charAsNumber;
            System.out.println(character);
            charAsNumber = reader.read();
        }
        reader.close();
    }

    public static void byteStream() {

    }
}
