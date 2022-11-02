package com.github.kabraxis.oop.jet_brains.instance_methods.ComplexNumbers;

public class Complex {
    double real;
    double image;

    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}
