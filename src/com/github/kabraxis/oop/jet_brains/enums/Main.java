package com.github.kabraxis.oop.jet_brains.enums;

public class Main {
    public static void main(String[] args) {
        // Initialize the variable
        UserStatus active = UserStatus.ACTIVE;
        // Access the value by the name() method
        System.out.println(active.name());

        // Access enum instance by its name. Is another way to initialize a variable
        UserStatus blocked = UserStatus.valueOf("BLOCKED");
        System.out.println(blocked);

        // Look at all constants of the enum by values() method as an array
        UserStatus[] statuses = UserStatus.values(); // [PENDING, ACTIVE, BLOCKED]

        // Ordinal position of an instance of enum
        System.out.println(active.ordinal());
        System.out.println(UserStatus.BLOCKED.ordinal());

        // Although an enum is a reference type, it can be compared by using .equals and ==
        System.out.println(active.equals(UserStatus.ACTIVE));
        System.out.println(active == UserStatus.ACTIVE);
    }
}

enum UserStatus {
    PENDING, ACTIVE, BLOCKED
}


