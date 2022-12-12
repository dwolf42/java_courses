// Inheritance

package com.github.kabraxis.oop.my_work.inheritance.company;

public class Programmer extends Employee {
    String[] programmingLanguages;

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

}
