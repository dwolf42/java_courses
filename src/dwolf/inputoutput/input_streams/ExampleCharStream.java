package dwolf.inputoutput.input_streams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;


public class ExampleCharStream {
    public static void main(String[] args) throws IOException {
        byteStream("/development/java/filehandling/file.txt");
        tryWithResources();
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

    public static void tryWithResources() {
        try (Reader reader1 = new InputStreamReader(new FileInputStream("\\development\\java\\filehandling\\file.txt"), StandardCharsets.UTF_8);
             Reader reader2 = new FileReader("\\development\\java\\filehandling\\myfile.txt")) {
            char[] chars1 = new char[100];
            int numberOfChars1 = reader1.read(chars1);
            System.out.println("chars1 = " + Arrays.toString(chars1));
            System.out.println("numberOfChars1 = " + numberOfChars1);

            char[] chars2 = new char[100];
            int numberOfChars2 = reader2.read(chars2);
            System.out.println("chars2 = " + Arrays.toString(chars2));
            System.out.println("numberOfChars2 = " + numberOfChars2);
        } catch (FileNotFoundException es) {
            es.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new File("\\development\\java\\filehandling\\HelloWorld.java"))) {
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine());
            }
        } catch (FileNotFoundException ess) {
            ess.printStackTrace();
        } catch (IOException ec) {
            ec.printStackTrace();
        }
    }
}
