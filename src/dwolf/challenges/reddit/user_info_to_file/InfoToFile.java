package dwolf.challenges.reddit.user_info_to_file;

import java.util.Scanner;

public class InfoToFile {
    private String userName;
    private int userAge;
    private String userRedditName;

    public void run() {
        System.out.println("Hi, my name is Brandigasco.");
        System.out.println("What is your name...?");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("So, " + userName + " what a lovely name!");

        System.out.println("I am 39877 years old. How about your age...?");
        userAge = scanner.nextInt();
        scanner.skip("\n");
        System.out.println("Being " + userAge + " years must be pretty interesting I guess.");
        System.out.println();

        System.out.println("Are you on Reddit? Tell me your username, so we can be friends there :)");
        userRedditName = scanner.nextLine();
        System.out.println("Wow, " + userRedditName + " sounds pretty cool!");
        System.out.println("I will send you a friend request");

        System.out.println("So, your name is " + userName + ", you are " + userAge + " years old, "
                + "and your username is " + userRedditName);
    }

}
