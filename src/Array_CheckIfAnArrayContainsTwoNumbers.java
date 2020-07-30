import java.util.Scanner;

public class Array_CheckIfAnArrayContainsTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();

        int[] array = new int[defineLength];

        for (int i = 0; i < defineLength; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean flag = false;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == n && array[i - 1] == m ||
                    array[i] == m && array[i - 1] == n) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}

/*
Write a program that reads an unsorted array of integers and two numbers n and m.
The program must check if n and m occur next to each other in the array (in any order).

Input data format

The first line contains the size of an array.
The second line contains elements of the array.
The third line contains two integer numbers n and m.
All numbers in the same line are separated by the space character.

Output data format

Only a single value: true or false.
Sample Input 1:

3
1 3 2
2 3

Sample Output 1:

true

Sample Input 2:

3
1 2 3
3 4

Sample Output 2:

false

*/