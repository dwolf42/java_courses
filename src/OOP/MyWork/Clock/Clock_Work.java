package OOP.MyWork.Clock;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Clock_Work {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        Display display = new Display();

        /*
         ***************************************************************
         * This part's purpose is educational only
         * This is used to access the static methods inside the class Display
         * To invoke a static method we don't need to create an object. We just call the method with the class name.
         * Display.instanceMethod();
         ***************************************************************
         */

        System.out.println("What time is it?");
        System.out.print("\nSet hours: ");
        clock.hours = scanner.nextInt();
        System.out.print("\nSet the ten minutes: ");
        clock.minutes1 = scanner.nextInt();
        System.out.print("\nSet one minutes: ");
        clock.minutes2 = scanner.nextInt();

        System.out.println("\n The time is: ");

        while (true) {
            clock.next();
            System.out.printf("%d:%d%d%n", clock.hours, clock.minutes1, clock.minutes2);
            TimeUnit.SECONDS.sleep(3);
        }
    }

}
