// Objects point to the same reference always share the same value

package dwolf.oop.jet_brains.objects.reference;

public class ObjectReferences {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();

        Hotel h2 = new Hotel();
        Hotel h3 = h2;

        h2.rating = 9;
        h3.rating = 8;

        h1.rating = 7;

        // Both print the same value, as h2 and h3 share the reference of the object
        System.out.println("h2: " + h2.rating); // 8
        System.out.println("h3: " + h3.rating); // 8


        Tree tree1 = new Tree();
        Tree tree2 = tree1;

        Tree tree3 = tree2;

        tree1 = new Tree(); // << 2nd initialization

        tree1.age = 5; // points to a new reference
        tree2.age = 10; // still points to the reference of the first initialization of tree 1

        tree3 = null;

        // Both print a different value, as tree1 gets a 2nd time initialized. So, tree2 still point's to the reference
        // of the first initialization of tree1.
        System.out.println("tree1: " + tree1.age); // 5
        System.out.println("tree2: " + tree2.age); // 10

    }

}

class Hotel {
    String name;
    String address;
    int rating;
}

class Tree {
    String sort;
    int age;
    double height;

}