package OOP.JetBrains.Clock;

public class Clock {
    private static final int MAX_HOURS = 12;
    private static final int MAX_MINUTES1 = 5;
    private static final int MAX_MINUTES2 = 9;
    private static final int MIN_MINUTES = 0;
    private static final int MIN_HOURS = 1;

    int hours = MAX_HOURS;
    int minutes1 = MIN_MINUTES;
    int minutes2 = MIN_MINUTES;

    int a = 1;
    int b = 2;
    int c = 3;


    void next() {
        // if hours is 12 && minutes1 5 && minutes2 is 9
        if ((this.hours == MAX_HOURS && this.minutes1 == MAX_MINUTES1 && this.minutes2 == MAX_MINUTES2)) {
            this.hours = MIN_HOURS;
            this.minutes1 = MIN_MINUTES;
            this.minutes2 = MIN_MINUTES;
        // if minutes1 is 5 && minutes2 is 9
        } else if (this.minutes1 == MAX_MINUTES1 && this.minutes2 == MAX_MINUTES2) {
            this.minutes1 = MIN_MINUTES;
            this.minutes2 = MIN_MINUTES;
            this.hours++;
        // if
        } else if (this.minutes1 < MAX_MINUTES1 && this.minutes2 == MAX_MINUTES2) {
            this.minutes1++;
            this.minutes2 = MIN_MINUTES;
        } else if (this.minutes1 ==) {} // Needs implementation
        else {
            System.out.println("Error");
        }
    }
}
