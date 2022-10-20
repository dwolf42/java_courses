package OOP.JetBrains.Circle;

public class CircleCalculation {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 5.0;

        System.out.println(circle1.getLength());
        System.out.println(circle1.getArea());
    }
}
