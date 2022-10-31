package OOP.MyWork.Clock;

public class Clock {
    private static final int MAX_HOURS = 12;
    private static final int MAX_MINUTES1 = 5;
    private static final int MAX_MINUTES2 = 9;
    private static final int MIN_MINUTES = 0;
    private static final int MIN_HOURS = 1;

    private int hours = MAX_HOURS;
    private int minutes1 = MIN_MINUTES;
    private int minutes2 = MIN_MINUTES;

    void next() {
        this.minutes2++;
        if (this.minutes2 > MAX_MINUTES2) {
            this.minutes2 = MIN_MINUTES;
            this.minutes1++;
        }

        if (this.minutes1 > MAX_MINUTES1) {
            this.minutes1 = MIN_MINUTES;
            this.hours++;
        }

        if (this.hours > MAX_HOURS) {
            this.hours = MIN_HOURS;
        }
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes1(int minutes1) {
        this.minutes1 = minutes1;
    }

    public void setMinutes2(int minutes2) {
        this.minutes2 = minutes2;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes1() {
        return this.minutes1;
    }

    public int getMinutes2() {
        return this.minutes2;
    }

}
