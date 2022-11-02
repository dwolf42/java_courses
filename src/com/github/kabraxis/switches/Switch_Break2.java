package com.github.kabraxis.switches;

import java.util.Scanner;

public class Switch_Break2 {
    public static void main(String[] args) {
        printIt(scanInput());
    }

    public static String scanInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printIt(String scanInput) {
        switch (scanInput) {
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
            case "six":
                System.out.println("6");
                break;
            case "seven":
                System.out.println("7");
                break;
            case "eight":
                System.out.println("8");
                break;
            case "nine":
                System.out.println("9");
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}
