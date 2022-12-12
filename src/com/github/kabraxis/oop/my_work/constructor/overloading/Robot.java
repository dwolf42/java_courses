// Constructor overriding

package com.github.kabraxis.oop.my_work.constructor.overloading;

public class Robot {
    String name;
    String model;
    int lifetime;

    Robot() {
        this.name = "Anonymous";
        this.model = "Unknown";
    }

    public Robot(String name, String model) {
        this(name, model, 20);
    }

    public Robot(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
        System.out.println("The third constructor is invoked");
    }

}
