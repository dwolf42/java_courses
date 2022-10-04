package OOP.JetBrains.InstanceMethods;

public class WorkingPeople {
    public static void main(String[] args) {

        // Calls the static method of class Human
        Human.averageWorking();

        // Creates an instance of the object Human and populates it with values
        Human peter = new Human();
        peter.name = "Peter";
        peter.age = 45;
        // Calls the instance method work of class Human
        peter.work(); // "Peter loves working!";

        // Creates an instance of the object Human and populates it with values
        Human alice = new Human();
        alice.name = "Alice";
        alice.age = 37;
        // Calls the instance method work of class Human
        alice.work(); // "Alice loves working!";

        // Peter calls the instance method and passes Alice to it
        peter.workTogetherWith(alice);

    }
}
