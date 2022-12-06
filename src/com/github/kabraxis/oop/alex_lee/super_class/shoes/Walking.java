package com.github.kabraxis.oop.alex_lee.super_class.shoes;

public class Walking extends Shoe {
    public final boolean goreTex;

    Walking(boolean goreTex, String brand, double size) {
        super(brand, size);
        this.goreTex = goreTex;
    }
}

