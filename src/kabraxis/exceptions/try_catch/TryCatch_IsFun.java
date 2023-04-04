package kabraxis.exceptions.try_catch;

public class TryCatch_IsFun {
    public static void main(String[] args) {
        System.out.println("before the try-catch block"); // it will be printed
        try {
            System.out.println("inside the try block before an exception"); // it will be printed

            System.out.println(2/0); // it throws ArithmeticException

            System.out.println("inside the try block after exception"); // it won't be printed
        } catch (NumberFormatException e) {
            System.out.println("Division by zero!"); // it will be printed
        }
        System.out.println("after the try-catch block"); // it will be printed
    }
}
