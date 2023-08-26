package dwolf.inputoutput.files.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindGreatestIntInFile {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(findAndReturnGreatestInt());
    }
    public static int findAndReturnGreatestInt() throws FileNotFoundException {
        int greatestNumber = 0;
        String pathToFile = "\\development\\java\\filehandling\\dataset_91007.txt";
        File file = new File(pathToFile);
        Scanner scanner = new Scanner(file);

        try {
            while(scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp > greatestNumber) {
                    greatestNumber = temp;
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }

        return greatestNumber;
    }
}
