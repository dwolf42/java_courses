package dwolf.nested_class;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Princess");
        Cat.Bow bow = cat.new Bow("golden");
        Cat.Bow.Arrow arrow = bow.new Arrow("electric");

        bow.printColor();
        bow.putOnABow();
        arrow.shootArrow();

        new Cat("Princess").new Bow("golden").putOnABow();


    }

}
