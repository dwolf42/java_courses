package OOP;

public class Example6 implements Example5 {
    public static void main(String[] args) {
        Example6 e6 = new Example6();
        e6.openBag();
    }

    @Override
    public void openBag() {
        System.out.println("Back opened");
    }
}
