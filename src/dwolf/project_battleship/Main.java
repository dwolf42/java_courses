package dwolf.project_battleship;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
   public static void main(String[] args) {
        // 65 = A => 0
        // 66 = B => 1
        // 74 = J
        Map<String, Integer> lettersToIndex = new LinkedHashMap<>();
        lettersToIndex.put("A", 0);
        lettersToIndex.put("B", 1);
        lettersToIndex.put("C", 2);
        lettersToIndex.put("D", 3);
        lettersToIndex.put("E", 4);
        lettersToIndex.put("F", 5);
        lettersToIndex.put("G", 6);
        lettersToIndex.put("H", 7);
        lettersToIndex.put("I", 8);
        lettersToIndex.put("J", 9);

//        lettersToIndex.forEach((key, value) -> {
//             System.out.println(key);
//        });

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine(); // F14
        String castUpper = userInput.toUpperCase();
        // String userInput = "F14";
        char letterPart = castUpper.charAt(0);
        int letterToInt = letterPart;
        int row = letterToInt - 65;
        System.out.println(letterPart);
        System.out.println(letterToInt);
        System.out.println(row);

   }
}