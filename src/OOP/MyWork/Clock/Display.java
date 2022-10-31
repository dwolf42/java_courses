package OOP.MyWork.Clock;

public class Display {

    public static void printWhatTime() {
        System.out.println("What time is it?");
    }

    String printSetHours = "Set hours: ";
    String printSetMinutes = "Set minutes: ";
    String printTheTime = "The time is: ";

    public String getPrintSetHours() {
        return this.printSetHours;
    }

    public String getPrintSetMinutes() {
        return this.printSetMinutes;
    }

    public String getPrintTheTime() {
        return this.printTheTime;
    }

}
