package dwolf.oop.my_work.clock;

public class Display {

    // Here I defined the text segments to be printed on screen.
    private static final String printSetHours = "Set hours: ";
    private static final String printSetMinutes = "Set minutes: ";
    private static final String printTheTime = "The time is: ";

    // This is a static method. It doesn't access any fields.
    public static void printWhatTime() {
        System.out.println("What's the time in 12h:00m format?");
    }

    // These are instance methods. They are accessing the referring fields.
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
