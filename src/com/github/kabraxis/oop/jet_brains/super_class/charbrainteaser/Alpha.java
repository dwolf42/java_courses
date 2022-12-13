package com.github.kabraxis.oop.jet_brains.super_class.charbrainteaser;

class Alpha {

    protected int n = 10;
    protected String s = "abc";
    protected char ch = 'q';

    public Alpha(int n) {
        this.n = n;
    }
}

class Beta extends Alpha {
    protected int n = 20;
    protected String s = "str";
    protected char ch = 'z';

    public Beta(int n, String s, char ch) {
        super(n);
        this.s = s;
        super.ch = ch;
    }

    public void print() {
        System.out.println(super.n + " " + super.s + " " + ch);
    }
}
