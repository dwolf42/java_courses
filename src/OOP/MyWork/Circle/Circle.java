package OOP.MyWork.Circle;

public class Circle {double radius;

    // write methods here
    public double getLength() {
        //  2 · r · π
        double multiplicator = 2.0;

        return multiplicator * this.radius * Math.PI;
    }

    public double getArea() {
        // π • r2
        double multiplicator = 2.0;

        return multiplicator * Math.pow(this.radius, this.radius);
    }
}