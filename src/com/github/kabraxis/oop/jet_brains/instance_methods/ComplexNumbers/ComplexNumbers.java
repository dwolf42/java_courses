package com.github.kabraxis.oop.jet_brains.instance_methods.ComplexNumbers;

public class ComplexNumbers {
    public static void main(String[] args) {

        Complex number = new Complex();
        number.real = 10;
        number.image = 4;

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;

        number.add(anotherNumber);

        System.out.println(number.real);
        System.out.println(number.image);
    }
}
/*
 * Complex numbers
 *Jake wants to write a program that works with complex numbers. He created a class Complex that represents a complex number with its real and imaginary parts. Now he needs instance methods so that he can calculate the sum and difference of two complex numbers.
 *
 *Help Jake and create two instance methods for his class:
 *
 *add(Complex num) that takes another complex number as an argument and adds its corresponding fields to the current instance;
 *subtract(Complex num) that takes another complex number as an argument and subtracts its corresponding fields from the current instance;
 *Both methods should return nothing.
 *
 *Do not make the fields and methods private.
 *
 *Let's consider the example for the add method. If number = 10 + 4i and anotherNumber = 6 + 6i, applying the method add to number with the argument anotherNumber changes number to number = 16 + 10i
 *
 *Complex number = new Complex();
 *number.real = 10;
 *number.image = 4;
 * // math expression of number = 10.0 + 4.0i
 *
 *Complex anotherNumber = new Complex();
 *anotherNumber.real = 6;
 *anotherNumber.image = 6;
 * // math expression of anotherNumber = 6.0 + 6.0i
 *
 *number.add(anotherNumber); // number = 16.0 + 10.0i
 */
