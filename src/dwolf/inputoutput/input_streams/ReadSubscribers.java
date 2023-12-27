package dwolf.inputoutput.input_streams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadSubscribers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(
                new File(
                        "/home/david/IdeaProjects/java_courses/development/java/filehandling/call_stat.txt"))) {
            while (scanner.hasNext()) {
                String first = scanner.next();
                String second = scanner.next();
                int duration = scanner.nextInt();
                if (duration > 60) {
                    System.out.println(first);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
