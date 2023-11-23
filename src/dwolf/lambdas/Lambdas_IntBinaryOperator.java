package dwolf.lambdas;

import java.util.function.IntBinaryOperator;

// This is the primitive type specialization of BinaryOperator for int.
public class Lambdas_IntBinaryOperator {
    public static void main(String[] args) {
        IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;

        System.out.println(binaryOperator.applyAsInt(110, 50));
    }
}
