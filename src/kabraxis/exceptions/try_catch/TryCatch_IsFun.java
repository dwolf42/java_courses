package kabraxis.exceptions.try_catch;

import java.util.Scanner;

public class TryCatch_IsFun {
    public static void main(String[] args) {
        catchout();
    }

    public static void catchout() {
        Scanner scanner = new Scanner(System.in);
        tryout(scanner.nextLine());
    }

    public static void tryout(String str) {
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("You may only input numbers");
            catchout();
        }
        System.out.println("End of tryout!");
    }
}