import java.util.Scanner;

public class IfScanner_Experiment {

    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextLine());

        int x = 7;
        if (x < 42) {
            System.out.println("Hi");
            int y = 270;
            if (x + y == 277) {
                System.out.println("That's quiet some code");
            }
        }
    }
}