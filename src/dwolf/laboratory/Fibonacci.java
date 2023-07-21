package dwolf.laboratory;

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der zu berechnenden Fibonacci-Terme ein: ");

        while (true) {
            try {
                int input = scanner.nextInt();

                if (input <= 0) {
                    System.out.println("Bitte geben Sie eine positive ganze Zahl ein:");
                } else {
                    printFibonacci(input);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein:");
                scanner.next(); // clears the invalid input
            }
        }
        scanner.close();
    }

    public static void printFibonacci(int input) {
        int num1 = 0;
        int num2 = 1;
        int sum;

        for(int i = 1; i <= input; i++) {
            System.out.println(num1);

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
