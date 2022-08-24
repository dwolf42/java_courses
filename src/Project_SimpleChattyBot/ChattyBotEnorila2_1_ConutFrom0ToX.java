package Project_SimpleChattyBot;

import java.util.Scanner;

public class ChattyBotEnorila2_1_ConutFrom0ToX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = "Enorila"; // name of the bot
        String s = ": ";
        System.out.println(n + s + "Hello! My name is " + n + ".");
        System.out.println(n + s + "I was created in 2020.");
        System.out.println(n + s + "Please, remind me your name.");

        String name = scanner.nextLine(); // asks your name

        System.out.println(n + s + "What a great name you have, " + name + "!");
        System.out.println(n + s + "Let me guess your age.");
        System.out.println(n + s + "Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = scanner.nextInt(); // guess age
        int rem5 = scanner.nextInt(); // guess age
        int rem7 = scanner.nextInt(); // guess age

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105; // guess age

        System.out.println(n + s + "Your age is " + age + ", that's a good time to start programming!");
        System.out.println(n + s + "Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        int input = scanner.nextInt(); // iterations
        int count = 0;

        for (int i = count; i <= input; i++) {

            System.out.println(n + s + " " + count + "!");
            count++;
        }

        System.out.println(n + s + "Completed, have a nice day!");
    }
}

/*

At this stage, you will program a bot to introduce it self, tell when it was created,
ask for your name, guess your age and count from 0 to any positive number you entered.

Here is an example of a dialogue with the new version of the bot. Input lines are started with ">" symbol.

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
> Max!
What a great name you have, Max!
Let me guess your age.
Say me remainders of dividing your age by 3, 5 and 7.
> 1 2 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!

*/
