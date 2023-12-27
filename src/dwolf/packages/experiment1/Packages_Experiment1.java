package dwolf.packages.experiment1;

import dwolf.oop.my_work.objects.instancemethods.Clock;
import dwolf.oop.my_work.objects.instancemethods.Display;

public class Packages_Experiment1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Clock clock1 = new Clock();

        Display display1 = new Display();

        System.out.print(display1.getPrintSetHours());
        clock1.setHours(scanner.nextInt());
        System.out.print(display1.getPrintSetMinutes());
        clock1.setMinutes1(scanner.nextInt());
        System.out.printf("%s%d:%d%d",
                display1.getPrintTheTime(), clock1.getHours(), clock1.getMinutes1(), clock1.getMinutes2());
    }
}