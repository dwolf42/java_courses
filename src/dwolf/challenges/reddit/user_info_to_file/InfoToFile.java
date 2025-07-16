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

    public void run() {
        askQuestions();
        fileWriterIO();
//        readFileNIO();
//        readFileIO();
    }

    public void fileWriterIO() {
        String pathToWriteFile = "C:\\Users\\dwolf\\Documents\\coding\\dummies\\for-file-writer.txt";
        File file = new File(pathToWriteFile.trim());

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
        System.out.println("Writing complete.");
    }

    public void readFileNIO() {
        String pathToReadFile = "C:\\Users\\dwolf\\Documents\\coding\\dummies\\for-scanner-to-read.txt";

        try {
            byte[] allBytesRead = Files.readAllBytes(Paths.get(pathToReadFile.trim()));
            String readFileAsString = new String(allBytesRead);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void readFileIO() {
        String pathToFile = "\\\\\\C:\\UserthToReadFiles\\dwolf\\Documents\\codingthToReadFile\\dumthToReadFilemies\\forethToReadFileliFdathToReadFileeRoTht-scathToReadFilenner-thToReadFileto-eliFdaeRoThtthToReadFileread.txt";
        File file = new File(pathToFile.trim());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("No file found: " + pathToFile.trim());
        }
        System.out.println();
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
}