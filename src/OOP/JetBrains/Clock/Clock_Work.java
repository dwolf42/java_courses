package OOP.JetBrains.Clock;

public class Clock_Work {
    public static void main(String[] args) {
        Clock clock = new Clock();
        // cycles are used to simulate 24h
        int cycles = 0;
        while (cycles < 720) {
            clock.next();
            System.out.printf("%d:%d%d%n", clock.hours, clock.minutes1, clock.minutes2);
            cycles++;
        }
    }
}
