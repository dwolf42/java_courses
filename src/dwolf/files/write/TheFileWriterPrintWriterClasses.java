package dwolf.files.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TheFileWriterPrintWriterClasses {
    public static void main(String[] args) throws IOException {
        writePrintWriter();
    }

    public static void writeFileWriter() {
        File file = new File("\\development\\java\\filehandling\\testfile.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Hellow again!");
        } catch (IOException e) {
            System.out.println("An exception has occurred: " + e.getMessage());
        }
    }

    public static void writePrintWriter() {
        File file = new File("\\development\\java\\filehandling\\testfile.txt");
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.print("\nHello");
            printWriter.println("Java");
            printWriter.println(123);
            printWriter.printf("You have %d %s", 400, "gold coins");
        } catch (IOException e) {
            System.out.println("An exception has occurred: " + e.getMessage());
        }
    }
}
