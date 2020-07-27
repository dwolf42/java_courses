import java.util.Scanner;
import java.util.Arrays;

public class Array_IteratingOverArray {
    public static void main(String[] args) {
        forEachLoop();
        forLoop();
        scannerToArray();
        isBroken();
    }

    public static void forEachLoop() {
        char[] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'}; // creating an array named "characters", containing some characters

        int counter = 0; // to count the amount of "a" in the array
        for (char ch : characters) { // reads: for each element ch of type char in the array characters do some statements in the body
            if (ch == 'a') { // when will some event be triggered?
                counter++; // what should happen, when triggered?
            }
        }
     System.out.println(counter); // it outputs "3"
    }

    public static void forLoop() {
        char [] characters = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

        int counter = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void scannerToArray() {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt(); // reading a length
        int[] array = new int[defineLength]; // creating an array with the specific length

        for (int i = 0; i < defineLength; i++) {
            array[i] = scanner.nextInt(); // read the next number to be put into the array
        }
        System.out.println(Arrays.toString(array)); // output the array
    }

    public static void isBroken() {
        int[] numbers = {1, 2, 3, 4, 5, 10, 6}; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                broken = true; // write a result
                break; // terminate the loop
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }
    }


}

