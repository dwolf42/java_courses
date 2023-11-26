package dwolf.collections.list_interface;

import java.util.*;

class ListsBasics {
    public static void main(String[] args) {
        // These are immutable, as instantiated with 'List.of'
        List<String> emptyList = List.of(); // 0 elements
        List<String> names = List.of("Larry", "Kenny", "Sabrina"); // 3 elements
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13); // 8 elements

        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        System.out.println(daysOfWeek.size()); // 7
        System.out.println(daysOfWeek.get(1)); // Tuesday
        System.out.println(daysOfWeek.indexOf("Sunday")); // 6

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]

        // It is partly-mutable, as instantiated with 'Arrays.asList'
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5); // fixed-size list
//        nums.add(6); will throw an exception, since the array is fixed-size
        nums.set(0, 8); // changing values will work here
        System.out.println(nums);
        // sets the list immutable
        nums = Collections.unmodifiableList(nums);

        // Making a mutable list of an immutable one.
        List<String> immutableList = List.of("one", "two", "tree");
        List<String> mutableList = new ArrayList<>(immutableList);
        mutableList.add("four");

        Objects.equals(List.of(1, 2, 3 ), List.of(1, 2, 3)); // true
        Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2)); // false

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println(Objects.equals(nums, num)); // true
        Objects.equals(immutableList,weekDays);

        Collection<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>(new ArrayList<>());


    }

}
