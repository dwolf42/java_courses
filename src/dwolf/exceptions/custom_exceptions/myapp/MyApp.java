package dwolf.exceptions.custom_exceptions.myapp;

import java.io.File;

public class MyApp {
    public static void main(String[] args) throws MyAppException{
        System.out.println(File.separator);
        throw new MyAppException("Something bad");

    }
}
