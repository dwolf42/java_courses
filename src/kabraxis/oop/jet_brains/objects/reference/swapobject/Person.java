package kabraxis.oop.jet_brains.objects.reference.swapobject;

public class Person {
    String name;
    int age;
}
class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempNameP1 = p1.name;
        int tempAgeP1 = p1.age;
        String tempNameP2 = p2.name;
        int tempAgeP2 = p2.age;

        p1.name = tempNameP2;
        p1.age = tempAgeP2;
        p2.name = tempNameP1;
        p2.age = tempAgeP1;

    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Fox";
        p1.age = 22;

        Person p2 = new Person();
        p2.name = "Wolf";
        p2.age = 32;

        System.out.println("Before Swap");
        System.out.println("p1 name: " + p1.name);
        System.out.println("p1 age: " + p1.age);
        System.out.println("");

        System.out.println("p2 name: " + p2.name);
        System.out.println("p2 age: " + p2.age);
        System.out.println("xxxxxxxx");

        changeIdentities(p1, p2);

//        (p1, p2);

        System.out.println("After Swap");
        System.out.println("p1 name: " + p1.name);
        System.out.println("p1 age: " + p1.age);
        System.out.println("");

        System.out.println("p2 name: " + p2.name);
        System.out.println("p2 age: " + p2.age);
    }
}