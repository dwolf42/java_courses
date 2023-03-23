package kabraxis.oop.my_work.clock;

public class Clock {

    // Here I defined the maximum and minimum values for the clock.
    private static final int MAX_HOURS = 12;
    private static final int MAX_MINUTES1 = 5;
    private static final int MAX_MINUTES2 = 9;
    private static final int MIN_MINUTES = 0;
    private static final int MIN_HOURS = 1;

    // Minutes are split in minutes1 and minutes2 for calculation. For more detail see the comments and implementation
    // of setMinutes1 and setMinutes2.
    private int hours = MAX_HOURS; // Can only go from 1-12. There is no implementation for 24 hours (0-23).
    private int minutes1 = MIN_MINUTES; // These are the tens minutes.
    private int minutes2 = MIN_MINUTES; // These are the one minutes.

    // When this method gets called it increases the values of hours, minutes1 and minutes2
    void next() {
        // The value of minutes2 is always increased by 1.
        this.minutes2++;
        // If minutes2 is now higher than MAX_MINUTES2, which is 9, the value of minutes2 will be reset
        // to MIN_MINUTES, which is 0. Also, minutes1 will be increased by 1. So after 49 the clock shows 50.
        if (this.minutes2 > MAX_MINUTES2) {
            this.minutes2 = MIN_MINUTES;
            this.minutes1++;
        }
        // If minutes1 is now higher than MAX_MINUTES1, which is 5, the value of minutes1 will be reset
        // to MIN_MINUTES, which is 0. Also, hours will be increased by 1. So after 1:59 the clock shows 2:00.
        if (this.minutes1 > MAX_MINUTES1) {
            this.minutes1 = MIN_MINUTES;
            this.hours++;
        }
        // If hours is now higher than MAX_HOURS, which is 12, the value of hours will be reset to MIN_HOURS,
        // which is 0. So after 12:59 the clock shows 1:00.
        if (this.hours > MAX_HOURS) {
            this.hours = MIN_HOURS;
        }
        // In case none of these conditions apply, the minutes just have increased by 1, as described in line 22.
    }

    // In this instance method the clock's hours will be set according to user input.
    public void setHours(int hours) {
        this.hours = hours;
    }

    // In this instance method the clock's minutes1 will be set according to user input, on which a math formula is
    // applied, so I get the tens minutes.
    public void setMinutes1(int minutes) {
        // If user inputs 42, only 4 (the tens minute) will be saved.
        this.minutes1 = (minutes % 100) / 10;
        // Here I pass the minutes variable, containing a 2-digit number from the user's input to the instance method
        // setMinutes2 for further processing.
        setMinutes2(minutes);
    }

    // In this instance method I receive the user's input passed from instance method setMinutes1.
    // The clock's minutes2 will be set according to user input, on which a math formula is applied,
    // so I get the one minutes.
    public void setMinutes2(int minutesFromSetMinutes1) {
        // If user inputs 42, only 2 (the tens minute) will be saved.
        this.minutes2 = minutesFromSetMinutes1 % 10;
    }

    // These are instance methods. They are accessing the referring fields.
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
