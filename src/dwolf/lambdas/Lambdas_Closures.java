package dwolf.lambdas;

import java.util.function.Function;

public class Lambdas_Closures {
    public static void main(String[] args) {
        // As hello is final, the lambda captures, and reuses it.
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        // Variable is effectively final, as it will not be changed
        int constant = 100;
        Function<Integer, Integer> adder100 = x -> x + constant;

        System.out.println(adder100.apply(200));
        System.out.println(adder100.apply(300));
    }
}
