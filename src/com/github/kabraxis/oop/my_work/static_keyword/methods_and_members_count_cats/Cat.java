package com.github.kabraxis.oop.my_work.static_keyword.methods_and_members_count_cats;

class Cat {
    String name;
    int age;
    static int counter = 0;
    final int maxCats = 5;

    public Cat(String name, int age) {
        counter++;
        if (Cat.counter > maxCats) {
            System.out.println("You have too many cats");
        }
        this.name = name;
        this.age = age;

    }

    public static int getNumberOfCats() {
        return counter;
    }
}
