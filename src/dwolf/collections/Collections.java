package dwolf.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * It is possible to refer to any particular collection (List, Set, Queue) via this base interface (Collection)since,
 * as you know, the superclass can be used to refer to any subclass object derived from that superclass.
 * This approach allows you to replace the concrete collection at any time without changing the code that uses it.
 * It also fosters software reuse by providing a standard interface for collections and algorithms to manipulate them.
 * <p>
 * So Collection<String> languages = new ArrayList<>() can easily be changed to
 * Collection<String> languages = new HashSet<>() etc.
 */

public class Collections {
    public static void main(String[] args) {
        Collection<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Deutsch");
        languages.add("Francais");

        System.out.println(languages.size()); // 3
        System.out.println(languages.add("Polska")); // true

        Collection<String> sprachen = new ArrayList<>();
        sprachen.add("English");
        sprachen.add("Schwedisch");
        sprachen.add("Deutsch");
        sprachen.add("Japanisch");

        sprachen.removeAll(languages);

        for (String str : sprachen) {
            System.out.println(str); // Schwedisch, Japanisch
        }

        sprachen.forEach(System.out::println); // with method reference
        // will print: Schwedisch, Japanisch
    }
}