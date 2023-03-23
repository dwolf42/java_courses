package kabraxis.switches;

import java.util.Scanner;

public class Switch_Basic1 {
    public static void main(String[] args) {
        userAnswer();
    }

    public static void userAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(returnsAnswer(scanner.nextInt()));
    }

    public static String returnsAnswer(int selectOption) {

        String opt1 = "Yes!";
        String opt2 = "No!";
        String opt3 = "Unknown number";

        switch (selectOption) {
            case 1:
                return opt1;
            case 2:
            case 3:
            case 4:
                return opt2;
            default:
                return opt3;
        }
    }
}
/*
We need your help to improve an adaptive system. There's a program that asks learners what programming language they are learning. There are four options, one of them is correct:
Java
Kotlin
Scala
Python
Your task: read the answer’s number from the standard input and output the result of the test: "Yes!", "No!" or "Unknown number". We hope you know which answer is correct. You don't need to print the question itself.
 Report a typo
 See hint
Sample Input 1:
1
Sample Output 1:
Yes!
Sample Input 2:
6
Sample Output 2:
Unknown number
*/