package com.github.kabraxis.oop.jet_brains.overloading;

public class TypeCasting {

        public static void print(short a) {
            System.out.println("short arg: " + a);
        }

        public static void print(int a) {
            System.out.println("int arg: " + a);
        }

        public static void print(long a) {
            System.out.println("long arg: " + a);
        }

        public static void print(double a) {
            System.out.println("double arg: " + a);
        }

        public static void main(String[] args) {
            print(100);
        }

    }

    /*
    When we pass some value to the method, the compiler does not evaluate it. All that is known is that it is an
    integer literal, so it has the integer type. In our case, 100 is treated as an int by default and JVM doesn't know
    if the passed value can be cast to short safely. So, the only way to pass the short argument is by
    casting the value explicitly: print((short)100);
    */