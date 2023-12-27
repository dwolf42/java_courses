package dwolf.lambdas;

import java.util.function.LongUnaryOperator;

public class Lambdas_UnaryOperator {
    public static void main(String[] args) {
        LongUnaryOperator unaryOperator = x -> x % 2 == 0 ? x + 2 : x + 1;

        System.out.println(unaryOperator.applyAsLong(2));
    }
}
