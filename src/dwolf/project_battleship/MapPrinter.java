package dwolf.project_battleship;

import java.util.Arrays;


/**
 *
 * <blockquote><pre>
 *       //////////////////// Example Game Map //////////////////
 *            1  2  3  4  5  6  7  8  9  10
 *            0  1  2  3  4  5  6  7  8  9
 *       A 0  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       B 1  ~  M  ~  M  ~  ~  O  ~  ~  ~
 *       C 2  ~  ~  M  ~  ~  ~  O  ~  ~  ~
 *       D 3  ~  ~  ~  M  ~  ~  O  ~  ~  ~
 *       E 4  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       F 5  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       G 6  ~  ~  O  O  X  O  O  ~  ~  ~
 *       H 7  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       I 8  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       J 9  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 * </pre></blockquote><p>
 *
 */

public class MapPrinter {
    private static char[][] gameMap;

    public MapPrinter() {
        gameMap = new char[10][10];

        for (char[] location : gameMap) {
            Arrays.fill(location, '~');
        }
    }

    public static void printMap() {
        // User will see the numbers 1 to 10 above game board for column enumeration
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print((i == 0 ? "  " : " ") + (i + 1));
        }
        System.out.println();

        // User will see the characters A to J left of game board for row enumeration
        // Using numbers as incrementor instead of characters to utilize the array's length as limit
        char ch = 'A';
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print(ch + " ");
            ch++;
            for (int j = 0; j < gameMap[i].length; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMap(int[] coordinates, char symbol) {

    }
}
/*
import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3};
        //           0  1  2  3
        //           i  j  i  j
        System.out.println("len: " + arr.length);

        String[][] arr2 = {
//                {'~', '~', '~', '~'},
//                {'~', '~', '~', '~'},
//                {'~', '~', '~', '~'},
//                {'~', '~', '~', '~'}};
                {"00", "01", "02", "03"},
                {"10", "11", "12", "13"},
                {"20", "21", "22", "23"},
                {"30", "31", "32", "33"}};

        System.out.println(arr2[arr[3]][arr[1]]);
        System.out.println(arr2[arr[2]][arr[3]]);
//        printArr(arr2);
//
//        for (int i = 0; i < arr.length; i += 2) {
//            for (int j = 1; j < arr.length; j += 2) {
//            //       i j
//            //
//            //    int a = arr[i]
//            //
//                arr2[arr[i]][arr[j]] = "X";
//            }
//        }
//
//        printArr(arr2);
    }

    public static void printArr(String[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}




 */