package dwolf.inputoutput.input_streams;

import java.io.*;
import java.util.Arrays;


public class ExampleCharStream {
    public static void main(String[] args) throws IOException {
        byteStream("/development/java/filehandling/file.txt");
    }

    public static void readerToArray(String path) throws IOException {
        Reader reader = new FileReader(path);

        char first = (char) reader.read(); // i
        char second = (char) reader.read(); // n

        char[] others = new char[12]; // gets filled by reader.read(), as it reads elements up to the capacity of the
        // passed array.
        int numbersOfReadElements = reader.read(others); // this is the number of read elements by reader.read()!
        reader.close();
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println(Arrays.toString(others));
        System.out.println(numbersOfReadElements);

    }

    public static void readerWhileLoop(String path) throws IOException {
        Reader reader = new FileReader(path);

        int charAsNumber = reader.read();
        while (charAsNumber != -1) {
            char character = (char) charAsNumber;
            System.out.println(character);
            charAsNumber = reader.read();
        }
        reader.close();
    }

    public static void byteStream(String path) throws IOException {
        FileInputStream inputStream = new FileInputStream(path);
        byte[] bytes = new byte[5];
        int numberOfBytes = inputStream.read(bytes);
        System.out.println(numberOfBytes);
        System.out.println(Arrays.toString(bytes));
        inputStream.close();
    }
}
