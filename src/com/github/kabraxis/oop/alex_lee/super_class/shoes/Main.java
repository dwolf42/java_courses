package com.github.kabraxis.oop.alex_lee.super_class.shoes;

public class Main {
    public static void main(String[] args) {
        Running nike = new Running("Nike", 4.3, 250);
        Walking hanwag = new Walking(true, "Hanwag", 43.5);
        Walking merrel = new Walking(false, "Merrel", 42);

        Shoe[] shoes = {nike, hanwag, merrel};

    }
}
