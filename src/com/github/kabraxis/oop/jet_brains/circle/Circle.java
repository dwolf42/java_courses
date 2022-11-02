package com.github.kabraxis.oop.jet_brains.circle;

public class Circle {
    double radius;

    public double getLength() {
        //  2 · r · π
        double multiplicator = 2.0;

        return multiplicator * this.radius * Math.PI;
    }

    public double getArea() {
        // π • r2
        return (this.radius * this.radius) * Math.PI;
    }
}