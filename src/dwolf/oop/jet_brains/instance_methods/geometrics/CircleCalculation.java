package dwolf.oop.jet_brains.instance_methods.geometrics;

public class CircleCalculation {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 5.0;

        System.out.println(circle1.getLength());
        System.out.println(circle1.getArea());
    }
}

/* Objectives
 * There is a class named Circle.
 *
 * This class has one field radius of the double type.
 *
 * Create two instance methods for this class:
 *
 * - getLength that returns the double representing the length of the circumference of this circle.
 * - getArea that returns the double representing the area of this circle.
 *
 * - In your calculations, you may use the special constant Math.PI.
 *
 * Do not make the field and methods private.
*/