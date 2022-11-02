package com.github.kabraxis.oop.jet_brains.patient_demo;

import java.util.Arrays;

public class PatientDemo {
    public static void main(String[] args) {
        Patient kabraxis = new Patient();

        kabraxis.name = "Kabraxis";
        kabraxis.age = 25;
        kabraxis.height = 1.70F;
        kabraxis.complaints = new String[] {"Back Pain"};
        kabraxis.complaints[4] = "back pain";

        System.out.println(kabraxis.name + " " + kabraxis.age + " " + kabraxis.height + " " + Arrays.toString(kabraxis.complaints));

        Patient alice = new Patient();

        alice.name = "Alice";
        alice.age = 22;
        alice.height = 1.65F;

        System.out.println(alice.name + " " + alice.age + " " + alice.height);

    }
}