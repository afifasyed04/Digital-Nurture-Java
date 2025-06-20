package Log;
public class Logger {
    // Step 1: Private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to return the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Step 4: Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    // Step 5: Main method to test Singleton
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        if (logger1 == logger2) {
            System.out.println("Singleton confirmed: Both references point to the same instance.");
        } else {
            System.out.println("Singleton failed: Different instances exist.");
        }
    }
}
