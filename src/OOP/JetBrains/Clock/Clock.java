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

    void next() {
        minutes2++;
        if (minutes2 > MAX_MINUTES2) {
            minutes2 = MIN_MINUTES;
            minutes1++;
        }

        if (minutes1 > MAX_MINUTES1) {
            minutes1 = MIN_MINUTES;
            hours++;
        }

        if (hours > MAX_HOURS) {
            hours = MIN_HOURS;
        }
    }

}
