package OOP.MyWork.Clock;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Clock_Work {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        Display display = new Display();

        /**
         *  This is used to access the static methods inside the class Display
         * To invoke a static method we don't need to create an object. We just call the method with the class name.
         */
        Display.printWhatTime();

        /**
         * These are used to access the instance methods of the object display,
         * which is an instance of the class Display
         */
        System.out.print(display.getPrintSetHours());
        clock.hours = scanner.nextInt();
        System.out.print(display.getPrintSetTenMinutes());
        clock.minutes1 = scanner.nextInt();
        System.out.print(display.getPrintSetOneMinutes());
        clock.minutes2 = scanner.nextInt();

        System.out.println("");
        System.out.print(display.getPrintTheTime());
        System.out.printf("%d:%d%d%n", clock.hours, clock.minutes1, clock.minutes2);
        TimeUnit.SECONDS.sleep(3);

        while (true) {
            clock.next();
            System.out.print(display.getPrintTheTime());
            System.out.printf("%d:%d%d%n", clock.hours, clock.minutes1, clock.minutes2);
            TimeUnit.SECONDS.sleep(3);
        }
    }

}