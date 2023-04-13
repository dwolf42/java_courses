package kabraxis.exceptions.try_catch;

import java.util.Scanner;

public class TryingToCatch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println(array[new Scanner(System.in).nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Yeah");
    }
}
