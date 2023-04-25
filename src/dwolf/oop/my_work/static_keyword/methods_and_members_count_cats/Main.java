package dwolf.oop.my_work.static_keyword.methods_and_members_count_cats;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Leyla", 14);
        System.out.println(Cat.getNumberOfCats());
        Cat c2 = new Cat("Mila", 13);
        System.out.println(Cat.getNumberOfCats());
        Cat c3 = new Cat("Rambo", 17);
        System.out.println(Cat.getNumberOfCats());
        Cat c4 = new Cat("Maggie", 15);
        System.out.println(Cat.getNumberOfCats());
        Cat c5 = new Cat("Kuschel", 25);
        System.out.println(Cat.getNumberOfCats());
        Cat c6 = new Cat("Maya", 18);
        System.out.println(Cat.getNumberOfCats());
        Cat c7 = new Cat("Laser Cat", 0);
        System.out.println(Cat.getNumberOfCats());
    }

}
