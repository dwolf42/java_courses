package kabraxis.exceptions.try_catch;

import java.util.Scanner;

public class TryCatch_IsFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        try {
            System.out.println(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("You may only input numbers");
            System.out.println(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("End of program!");


        Account acc = new Account();
        acc.deposit(100_000_001L);
    }

}

class Account {

    private long balance = 0;

    public void deposit(long amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Incorrect sum " + amount);
        }

        if (amount >= 100_000_00L) {
            throw new IllegalArgumentException("Too large amount");
        }

        balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}