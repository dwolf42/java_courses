package dwolf.logging.workerlogs;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMain {
    // Create a logger for this class
    private static final Logger logger = Logger.getLogger(LoggerMain.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Starting the LoggerMain program.");

        // Instantiate the Worker class
        Worker worker = new Worker("John");

        // Use the methods of the Worker class
        worker.doWork();
        String report = worker.generateReport();

        logger.log(Level.INFO, "Generated report: {0}", report);
        logger.log(Level.INFO, "Exiting the LoggerMain program.");
    }
}
