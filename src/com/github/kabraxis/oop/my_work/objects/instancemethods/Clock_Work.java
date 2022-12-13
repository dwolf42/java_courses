package com.github.kabraxis.oop.my_work.clock;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Clock_Work {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Creating the object Clock named clock.
        Clock clock = new Clock();
        // Creating the object Display named display.
        Display display = new Display();

        // This is used to access the static methods inside the class Display
        // To invoke a static method I don't need to create an object. I just call the method by the class name.
        // Calling the object Display(object) display(name/identifier)'s static method printWhatTime().
        Display.printWhatTime();

        // These are used to access the instance methods of the object display,
        // which is an instance of the class Display.
        // Calling the object Display display's instance method getPrintSetHours(), so it can be printed.
        System.out.print(display.getPrintSetHours());
        // Calling the object Cock clock's instance method setHours and passing it the scanned integer.
        clock.setHours(scanner.nextInt());

        /* Note: Minutes will be entered naturally as 2-digit number, but processed as two individual numbers!*/
        // Calling the object Display display's instance method getPrintSetMinutes(), so it can be printed.
        System.out.print(display.getPrintSetMinutes());
        // Calling the object Clock clock's instance method setHours and passing it the scanned integer.
        clock.setMinutes1(scanner.nextInt());

        // Newline inserted before calling the object Display display's instance method getPrintTheTime(), as well as
        // the object Clock clock's methods getHours(), getMinutes1() and getMinutes2(), so they can be printed.
        System.out.printf("\n%s%d:%d%d%n",
                display.getPrintTheTime(),clock.getHours(), clock.getMinutes1(), clock.getMinutes2());
        /* For testing purposes, set this low, like 1-3 seconds, but remember reverting it
         back to 60 for proper simulation. */
        // Lets the program sleep/wait for x minutes to simulate natural clock behavior.
        TimeUnit.SECONDS.sleep(3);

        // Infinite loop to simulate an ongoing clock.
        while (true) {
            // Calling the object Clock clock's instance method next(), which increments (increases) hours and minutes
            // according to time passed.
            clock.next();
            // Calling the object Display display's instance method getPrintTheTime(), as well as calling the object
            // Clock clock's methods getHours(), getMinutes1() and getMinutes2(), so they can be printed.
            System.out.printf("%s%d:%d%d%n",
                    display.getPrintTheTime(), clock.getHours(), clock.getMinutes1(), clock.getMinutes2());
            // Lets the program sleep/wait for x minutes to simulate natural clock behavior.
            TimeUnit.SECONDS.sleep(3);
        }
    }

}