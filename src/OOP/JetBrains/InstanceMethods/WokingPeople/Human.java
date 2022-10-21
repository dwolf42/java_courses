package OOP.JetBrains.InstanceMethods.WokingPeople;

public class Human {
    String name;
    int age;

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work() {
        System.out.println(this.name + " loves working!");
    }

    public void workTogetherWith(Human other) {
        System.out.println(this.name + " loves working with " + other.name + '!');
    }
}
