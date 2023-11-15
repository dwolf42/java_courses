package dwolf.lamdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas_Expressions {
    public static void main(String[] args) {
        // Checks if x is divisible by y, returns true/false
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;

        // Apply the result of the BiFunction to a variable
        boolean result4Div2 = isDivisible.apply(4, 2);
        System.out.println(result4Div2);

        // Prints the length of the string, by accessing the string method length()
        Function<String, Integer> f = str -> str.length();
        // Passing as object (by reference)
        printResultOfLambda(f);
        // Passing expression directly
        printResultOfLambda(str -> str.length());

        // Passing some piece of code as data, instead of regular data. So the method's behavior varies at runtime.
        // This makes the method, which gets the code passed a "higher-order method", as it takes a function as parameter.
        printResultOfLambda(str -> {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });


    }

    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY NEW YEAR 3000!"));
    }
}
