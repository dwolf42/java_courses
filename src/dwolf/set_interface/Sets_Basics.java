package dwolf.set_interface;

import java.util.*;

class Sets_Basics {
    public static void main(String[] args) {
        // Immutable
        Set<String> emptySet = Set.of();
        Set<String> people = Set.of("Larry", "Kenny", "Sabrina");
        Set<Integer> numbers = Set.of(100, 200, 300, 400);

        System.out.println(emptySet);
        System.out.println(people);
        System.out.println(numbers);

        System.out.println(emptySet.contains("hello")); // false
        System.out.println(people.contains("Sabrina")); // true
        System.out.println(people.contains("John")); // false
        System.out.println(numbers.contains(300)); // true


        // HashSet (Mutable)
        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("Japan");
        countries.add("Switzerland");
        countries.add("Japan");
        countries.add("Brazil");
        System.out.println(countries);
        System.out.println(countries.contains("Switzerland"));

        // TreeSet (Mutable)
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);

        System.out.println(sortedSet); // [10, 13, 15, 17, 21]

        System.out.println(sortedSet.headSet(15)); // [10, 13]
        System.out.println(sortedSet.tailSet(15)); // [15, 17, 21]

        System.out.println(sortedSet.subSet(13,17)); // [13, 15]

        System.out.println(sortedSet.first()); // minimum is 10
        System.out.println(sortedSet.last());  // maximum is 21


        // Comparator (sorting)
        Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();

        SortedSet<Integer> numbers2 = new TreeSet<>(reverseOrderComparator);
        numbers2.add(5);
        numbers2.add(3);
        numbers2.add(10);

        numbers2.forEach(System.out::println);
        // comparator() gives information about what sorting Comparator<> did use to sort the elements
        System.out.println(numbers2.comparator());

    }
}
