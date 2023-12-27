package dwolf.laboratory.set_interface;

import java.util.*;

class SetListOfArraysAsList_Experiments {
    public static void main(String[] args) {
        SortedSet<Integer> setOf = new TreeSet<>(Set.of(1, 2, 3, 4, 4));
        SortedSet<Integer> listOf = new TreeSet<>(List.of(1, 2, 3, 4));
        SortedSet<Integer> arraysAsList = new TreeSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("setOf: " + setOf);
        System.out.println("setOf size: " + setOf.size());
        setOf.add(5);
        System.out.println("setOf size: " + setOf.size());
        setOf.remove(2);
        System.out.println("setOf: " + setOf);
        System.out.println("setOf size: " + setOf.size());

        System.out.println("listOf: " + listOf);
        System.out.println("listOf size: " + listOf.size());
        listOf.add(5);
        System.out.println("listOf size: " + listOf.size());
        listOf.remove(2);
        System.out.println("listOf: " + listOf);
        System.out.println("listOf size: " + listOf.size());

        System.out.println("arraysAsList: " + arraysAsList);
        System.out.println("arraysAsList size: " + arraysAsList.size());
        arraysAsList.add(5);
        System.out.println("arraysAsList size: " + arraysAsList.size());
        arraysAsList.remove(2);
        System.out.println("arraysAsList: " + arraysAsList);
        System.out.println("arraysAsList size: " + arraysAsList.size());
    }
}
