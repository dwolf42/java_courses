package dwolf.lamdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas_Basics {
    public static void main(String[] args) {

        // Is basically a method in which I must input a value to get a value
        // Adds 1 to a number, returns the result
        Function<Integer, Integer> adder1 = x -> x + 1;
        System.out.println(adder1.apply(5));
        // The same as
        System.out.println(adder1Method(5));

        // Checks if x is divisible by y, returns true/false
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        System.out.println(isDivisible.apply(144, 12));
        System.out.println(isDivisibleMethod(144, 12));

        // Has multiple statements
        Function<Integer, Integer> adder5 = (x) -> {
            x += 1;
            x += 2;
            return x;
        };
        System.out.println(adder5.apply(2));

    }

    public static Integer adder1Method(Integer x) {
        return x + 1;
    }

    public static Boolean isDivisibleMethod(Integer x, Integer y) {
        return x % y == 0;
    }

}
