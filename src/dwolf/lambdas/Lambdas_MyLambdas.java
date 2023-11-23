package dwolf.lambdas;

import java.util.function.Function;

public class Lambdas_MyLambdas {
    public static void main(String[] args) {
        Function<Integer, Integer> add1 = x -> x + 1;
        Function<Integer, Integer> add2 = (Integer x) -> {
            x += 1;
            return x;
        };

        Function<String[], Integer> count = arr -> arr.length;

        Function<Integer, Boolean> isDiv2 = x -> x % 2 == 0;
        boolean numIsDiv2 = isDiv2.apply(3);


        System.out.println(add1.apply(1));
        System.out.println(add2.apply(1));
        System.out.println(count.apply(new String[5]));
        System.out.println(numIsDiv2);

        Function<String, Integer> func = str -> str.length();
        printResultOfLambda(func);
        printResultOfLambda(str -> {
            int countLetterA = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a') {
                    countLetterA++;
                }
            }
            return countLetterA;
        });

        Function<Integer, Integer> addNumber = createAdder(10);

        System.out.println(addNumber.apply(5));
    }

    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("Happy new year 3000!"));
    }

    private static Function<Integer, Integer> createAdder(int numberToAdd) {
        return (number) -> number + numberToAdd;
    }
}
