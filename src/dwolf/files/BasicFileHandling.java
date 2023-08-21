package dwolf.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class BasicFileHandling {
    public static void main(String[] args) {
        String pathToHelloWorldJava = "\\development\\java\\filehandling\\HelloWorld.java";
        try {
            System.out.println(readFileAsString(pathToHelloWorldJava));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }

    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    static void scan() {
        Scanner scanner = new Scanner(System.in);
        String hi = scanner.nextLine();
        System.out.println(hi);
    }

    static void readFiles() throws FileNotFoundException {
        String pathToFile = "\\development\\java\\filehandling\\myfile.txt";
        File file = new File(pathToFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

   static void basicMethods() {
        File file = new File("\\development\\java\\filehandling\\image.png");
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path: " + file.getParent());
        System.out.println("can read: " + file.canRead());
        System.out.println("can modify: " + file.canWrite());
        System.out.println("can execute: " + file.canExecute());
    }


}
