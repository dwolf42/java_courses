package com.github.kabraxis.oop.jet_brains.getters_settes.gettingfullname;

public class GettingFullName {
    public static void main(String[] args) {

        User faruk = new User();
        faruk.setFirstName("Faruk");
        faruk.setLastName("Swampeye");
        System.out.println(faruk.getFullName()); // Faruk Swampeye

        User mamina = new User();
        mamina.setFirstName("Mamina");
        mamina.setLastName(null);
        System.out.println(mamina.getFullName()); // Mamina (without additional spaces)

        User unknowner = new User();
        unknowner.setFirstName(null);
        unknowner.setLastName(" ");
        System.out.println(unknowner.getFullName()); // Unknown
    }
}
