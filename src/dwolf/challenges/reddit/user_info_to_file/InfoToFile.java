package dwolf.challenges.reddit.user_info_to_file;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InfoToFile {
    private String userName;
    private int userAge;
    private String userRedditName;
    String pathToFile;

    public InfoToFile() {
        pathToFile = "C:\\Users\\dwolf\\Documents\\coding\\dummies\\InfoToFile.txt";
    }
    public void run() {
        askQuestions();
        fileWriterIO();
        readFileIO();
        readFileNIO();
    }

    public void fileWriterIO() {
        File file = new File(pathToFile.trim());

        System.out.println("Writing data to file...");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("userName = \"" + userName + "\";");
            writer.write("\n");
            writer.write("userAge = \"" + userAge + "\";");
            writer.write("\n");
            writer.write("userRedditName = \"" + userRedditName + "\";");

        } catch (IOException e) {
            System.out.printf("Error writing: %s", e.getMessage());
            return;
        }
        System.out.println("Writing complete.\n");
    }
    public void askQuestions() {
        System.out.println("Hi, my name is Brandigasco.");
        System.out.println("What is your name...?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("So, " + userName + " what a lovely name!");

        System.out.println();
        System.out.println("I am 39877 years old. How about your age...?");

        do {
            try {
                userAge = scanner.nextInt();
            } catch (Exception e) {
                // No e.getMessage() since it's always 'null'
                System.out.println("Error: Only input numbers, please.");
                // Flush all tokens except for the newline character for the scanner to be able to scan again
                scanner.skip("[^\\n]*");
            }
        } while (userAge == 0);

        // Flush the newline character token which is remaining after scanning integers
        scanner.skip("\n");
        System.out.println();
        System.out.println("Being " + userAge + " years must be pretty interesting I guess.");
        System.out.println();

        System.out.println("Are you on Reddit? Tell me your username, so we can be friends there :)");
        userRedditName = scanner.nextLine();
        System.out.println();
        System.out.println("Wow, " + userRedditName + " sounds pretty cool!");
        System.out.println("I will send you a friend request");

        System.out.println();
        System.out.println("So, your name is " + userName + ", you are " + userAge + " years old, "
                + "and your username is " + userRedditName);
        System.out.println();
    }

    public void readFileIO() {
        File file = new File(pathToFile.trim());
        System.out.println("Reading file...\n");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        System.out.println();
    }

    public void readFileNIO() {
        System.out.println("Reading file...\n");

        try {
            byte[] allBytesRead = Files.readAllBytes(Paths.get(pathToFile.trim()));
            String readFileAsString = new String(allBytesRead);
            System.out.println(readFileAsString);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        System.out.println();
    }


}