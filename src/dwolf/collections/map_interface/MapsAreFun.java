package dwolf.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class MapsAreFun {
    public static void main(String[] args) {
        // Creatin a HashMap object
        Map<String, Integer> students = new HashMap<>();

        // Adding key-value pairs (student name and age) to the HashMap
        students.put("Alice", 20);
        students.put("Bob", 22);
        students.put("Charlie", 19);
        students.put("Eno", 23);

        // Retrieving a value by its key
        // Integer instead of int, since Map works only with complex data types
        Integer enoAge = students.get("Eno");
        System.out.println("Eno's age: " + enoAge);

        // Checkinf if a key is present in a HashMap
        boolean containsKey = students.containsKey("John");
        System.out.println("Is John in the HashMap? " + containsKey);

        // Iterating over the HashMap using for-each loop and entrySet
        System.out.println("Iterating over the HashMap: ");
        for(Map.Entry<String, Integer> entry: students.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + ": " + age);
        }

        // Using the size() method to find the number of key-value pairs
        int size = students.size();
        System.out.println("Number of students in the HashMap: " + size);
    }
}
