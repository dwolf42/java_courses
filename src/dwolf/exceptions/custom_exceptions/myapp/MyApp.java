package dwolf.exceptions.custom_exceptions.myapp;

public class MyApp {
    public static void main(String[] args) throws MyAppException{
        throw new MyAppException("Something bad");
    }
}
