package dwolf.hide_override_overload_methods;

public class Tryout {
    public static void main(String[] args) {
        Feline feline = new Feline();
        feline.makeSound();

        Feline katze = new Katze();
        katze.makeSound();
    }
}

class Feline {
    public void makeSound() {
        System.out.println("His!");
    }
}

class Katze extends Feline {
//    @Override
    public void makesSound() {
        System.out.println("meow!");
    }
}
