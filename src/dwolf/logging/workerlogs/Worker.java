package dwolf.logging.workerlogs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {

    // Create a logger for this class
    private static final Logger logger = Logger.getLogger(Worker.class.getName());

    private String name;

    // Constructor
    public Worker(String name) {
        this.name = name;
        logger.log(Level.INFO, "Worker {0} has been created.", name);
    }

    // Void method
    public void doWork() {
        logger.log(Level.INFO, "{0} is doing work.", name);
        // ... some work happens here
        System.out.println(name + ": I am doing my work!");
    }

    // Method with a return value
    public String generateReport() {
        logger.log(Level.INFO, "{0} is generating a report.", name);
        return name + "'s report";
    }
}
