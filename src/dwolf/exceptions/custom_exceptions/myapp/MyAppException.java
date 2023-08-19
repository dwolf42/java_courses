package dwolf.exceptions.custom_exceptions.myapp;

// It is a checked exception because it extends the Exception class
public class MyAppException extends Exception {
    public MyAppException(String msg) {
        super(msg);
    }

    public MyAppException(Exception cause) {
        super(cause);
    }
}
