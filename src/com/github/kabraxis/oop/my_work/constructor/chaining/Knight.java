package com.github.kabraxis.oop.my_work.constructor.chaining;

 class Knight {
    String name;
    int strength;
    String weapon;

     Knight() {
         this.name = "Anonymous";
         this.strength = 0;
         this.weapon = "Bare Fists";
     }
     Knight(String name) {
         this();
         this.name = name;
     }

     Knight(String name, int strength) {
         this(name);
         this.strength = strength;
     }

     Knight(String name, int strength, String weapon) {
         this(name,strength);
         this.weapon = weapon;
     }
}
