package dwolf.set_interface;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Set_Operations {
    public static void main(String[] args) {
        // getting a mutable set from an immutable one
        Set<String> countries = new HashSet<>(List.of("India", "Japan", "Switzerland"));
        countries.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countries);
    }

}
