import java.util.Scanner;

public class Array_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] array = new int[defineLength];

        for (int i = 0; i < defineLength; i++) {
            array[i] = scanner.nextInt();
        }

        int countNumbers = 0;
        for (int num : array) {
            countNumbers += num;
        }
        System.out.println(countNumbers);
    }
}

