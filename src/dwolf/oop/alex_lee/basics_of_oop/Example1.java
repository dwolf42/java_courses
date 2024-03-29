package dwolf.oop.alex_lee.basics_of_oop;
/*
- A class is a blueprint for an object -
- An object is basically everything, your headphones, computer, smartphone etc. -

The pillars of OOP are:
1. Encapsulation
Private and public are access modifiers.
To access a private variable we need setters and getters.
This is called encapsulation.

2. Abstraction
-> Interface
An interface is just a list of objects and methods.
Like everything about object-oriented programming is just a list of variables and methods.
There don't have to be any implemented methods, because in an interface we're just listing these methods up.
Which leads to abstraction, which means, only the details the user needs to know are there and
everything else is hidden.
Like the power switch of your monitor, you only know that it turns on the screen, but how exactly it works is hidden.
The interface of Example5 is completely abstracted, because it doesn't say how openBag() is implemented,
it doesn't show what the code is for openBag().

3. Inheritance
When we extend Example2 with Example1, like we did here, than this is inheritance. We inherit the methods, objects,
variables of Example2, into Example1.
So if you see something like "public class Example1 extends Example2", this means there is an inheritance
relationship here.
Example1 is the sub-class and the one it inherits is the super-class.
Inheritance is good for the reusability of code.

4. Polymorphism
We can have multiple methods with the same name, but with different parameters (those inside the parenthesis).
Polymorphism means many forms, so a method could have many forms, like sayName() and sayName(String name).
This is also called overloading a method.
The other type of polymorphism is overwriting a method.
In Example2 we have a sayHi method, which is overwritten by the sayHi method in Example1.
 */

public class Example1 extends Example2 {
    String name;

    public void sayName() {
        System.out.println("My name!");
    }

    public void sayName(String name) {
        System.out.println("My name is " + name);
    }

// Overrides the method from Example2
    public void sayHi() {
        System.out.println("Hey!");
    }

    public static void main(String[] args) {
        Example1 p1 = new Example1();
        p1.sayHi();
    }
}
