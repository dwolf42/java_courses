package com.github.kabraxis.packages.experiment1;

import com.github.kabraxis.oop.my_work.clock.Display;

public class Packages_Experiment1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        com.github.kabraxis.oop.my_work.clock.Clock clock1 = new com.github.kabraxis.oop.my_work.clock.Clock();

        Display display1 = new Display();

        System.out.print(display1.getPrintSetHours());
        clock1.setHours(scanner.nextInt());
        System.out.print(display1.getPrintSetMinutes());
        clock1.setMinutes1(scanner.nextInt());
        System.out.printf("%s%d:%d%d",
                display1.getPrintTheTime(), clock1.getHours(), clock1.getMinutes1(), clock1.getMinutes2());
    }
}