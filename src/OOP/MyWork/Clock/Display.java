package OOP.MyWork.Clock;

public class Display {

    public static void printWhatTime() {
        System.out.println("What time is it?");
    }

    String printSetHours = "Set hours: ";
    String printSetTenMinutes = "Set ten minutes: ";
    String printSetOneMinutes = "Set one minutes: ";
    String printTheTime = "The time is: ";

    public String getPrintSetHours() {
        return this.printSetHours;
    }

    public String getPrintSetTenMinutes() {
        return this.printSetTenMinutes;
    }

    public String getPrintSetOneMinutes() {
        return this.printSetOneMinutes;
    }

    public String getPrintTheTime() {
        return this.printTheTime;
    }

}
