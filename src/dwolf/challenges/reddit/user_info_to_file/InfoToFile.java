package dwolf.challenges.reddit.user_info_to_file;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InfoToFile {
    private String userName;
    private int userAge;
    private String userRedditName;
    String pathToFile;

    public InfoToFile() {

        final String OS_TYPE = System.getProperty("os.name");
        final String OS_USERNAME = System.getProperty("user.name");
        final String OS_WINDOWS = "Windows";

        // For ease of use and maintaining this program's purpose, System.file.seperator or similar was not used
        if (OS_TYPE.contains(OS_WINDOWS)) {
            pathToFile = String.format("C:\\Users\\%s\\Documents\\coding\\dummies\\InfoToFile.txt", OS_USERNAME);
        } else {
            pathToFile = String.format("/home/%s/Documents/dev/dummies/InfoToFile.txt", OS_USERNAME);
        }
    }

    public void runInfoToFile() {
        if (pathToFile != null) {
            try {
                askQuestions();
                useFileWriterIO();
                useReadFileIO();
                useReadFileNIO();
            } catch (IOException ex) {
                System.err.printf("Error: %s\n", ex.getMessage());
                ex.printStackTrace();
                System.err.println("Placeholder");
            }
        } else {
            System.err.println("Invalid file path. Terminating program.");
        }
    }

    public void useFileWriterIO() {
        File file = new File(pathToFile);

        System.out.println("Writing data to file...");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("userName = \"" + userName + "\";");
            writer.write("\n");
            writer.write("userAge = \"" + userAge + "\";");
            writer.write("\n");
            writer.write("userRedditName = \"" + userRedditName + "\";");
        } catch (IOException ioe) {
            System.err.printf("Caught IOException: %s\n", ioe.getMessage());
            System.err.println("Invalid file.");
            return;
        }
        System.out.println("Writing complete.\n");
    }

    public void askQuestions() {
        System.out.println("Hi, my name is Brandigasco.");
        System.out.println("What is your name...?");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.printf("So, %s - what a lovely name!\n", userName);
        System.out.println();
        System.out.println("I am 39877 years old. How about your age...?");

        do {
            try {
                userAge = scanner.nextInt();
            } catch (InputMismatchException ime) {
                // No e.getMessage() since it's always 'null'
                System.out.println("Error: Only input numbers, please.");
                // Flush all tokens except for the newline character for the scanner to be able to scan again
                scanner.skip("[^\\n]*");
            }
        } while (userAge == 0);

        // Flush remaining newline token after scanning integers
        scanner.skip("\n");
        System.out.printf("Being %d years must be pretty interesting.\n", userAge);
        System.out.println();

        System.out.println("Are you on Reddit? Tell me your username, so we can be friends there :)");
        userRedditName = scanner.nextLine();
        System.out.println();
        System.out.printf("Wow, %s sounds pretty cool!\n", userRedditName);
        System.out.println("I will send you a friend request");

        System.out.println();
        System.out.printf("So, your name is %s, you are %d years old, and your username is %s.\n",
                userName, userAge, userRedditName);
        System.out.println("What a nice conversation!");
        System.out.println();
    }

    public void useReadFileIO() throws FileNotFoundException {
        File file = new File(pathToFile);

        System.out.println("Reading file...\n");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.printf("%s \n", scanner.nextLine());
        }

        // Formatting
        System.out.println();
    }

    public void useReadFileNIO() throws IOException {
        Path pathsToFile = Paths.get(pathToFile);

        System.out.println("Reading file...\n");

        byte[] allBytesRead = Files.readAllBytes(pathsToFile);
        String readFileAsString = new String(allBytesRead);
        System.out.println(readFileAsString);
        System.out.println();
    }
}