package dwolf.collections.set_interface;

import java.util.*;

/*
*
* Implement two methods.
* The first method should create a set from a string of numbers separated by a space.
* The second method should remove all numbers greater than 10 from the given set.
*
* */
class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        SortedSet<String> strToSet = new TreeSet<>(
                Arrays.asList(
                        str.split(" ")
                ));

        SortedSet<Integer> strToInteger = new TreeSet<>();
        for (String s : strToSet) {
            strToInteger.add(Integer.valueOf(s));
        }

        return strToInteger;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
       set.removeIf(n -> n > 10);
    }

}

/* Do not change code below */
class Set_RemoveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}

