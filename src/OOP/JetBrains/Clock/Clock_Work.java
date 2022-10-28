package OOP.JetBrains.Clock;
import java.util.concurrent.TimeUnit;

public class Clock_Work {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();

        while (true) {
            clock.next();
            System.out.printf("%d:%d%d%n", clock.hours, clock.minutes1, clock.minutes2);
            TimeUnit.SECONDS.sleep(5);

        }
    }
}
