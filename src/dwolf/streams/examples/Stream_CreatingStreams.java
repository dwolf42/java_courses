package dwolf.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Stream_CreatingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);
        long count = numbers.stream()
                .filter(number -> number > 5)
                .count();

        // Obtain stream from a collection
        List<Integer> famousNumbers = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        Stream<Integer> numbersStream = famousNumbers.stream();

        Set<String> usefulConcepts = Set.of("functions", "lazy", "immutability");
        Stream<String> conceptSTream = usefulConcepts.stream();

        // Obtain streams from an array
        Stream<Double> doubleStream = Arrays.stream(new Double[]{1.01, 1d, 0.99, 1.02, 1d, 0.99});

        // Obtain stream directly from values
        Stream<String> persons = Stream.of("John", "Dementia", "Cleopatra");

        // Concatenate streams together
        Stream<String> stream1 = Stream.of("Fredda", "Echo", "Vlad");
        Stream<String> stream2 = Stream.of("Fiona", "Setsuna", "Dream");
        Stream<String> resultStream = Stream.concat(stream1, stream2);
        resultStream.forEach(System.out::println);

        Stream<Integer> empty1 = Stream.of();
        Stream<Integer> empty2 = Stream.empty();
        empty1.forEach(System.out::println);
        empty2.forEach(System.out::println);

        // Example
        List<String> companies = List.of(
                "Google", "Amazon", "Samsung", "JetBrains",
                "GOOGLE", "amazon", "Oracle"
        );

        companies.stream()
                // intermediate operation
                .map(String::toUpperCase) // transforms each name to upper case
                // intermediate operation
                .distinct() // keep only unique words
                .forEach(System.out::println); // print every company
    }


}
