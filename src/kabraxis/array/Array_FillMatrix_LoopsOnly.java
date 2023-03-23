package kabraxis.array;
import java.util.Scanner;

public class Array_FillMatrix_LoopsOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int defineLength = scanner.nextInt();

        for (int i = 0; i < defineLength; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < defineLength - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
/*
Given the number n, not greater than 100, create the matrix of size n×n and fill it using the following rule.
Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one,
should contain numbers 1. The next two diagonals should contain numbers 2; etc.

Note: the primary diagonal runs from the top left corner to the bottom right corner.

Sample Input 1:

5

Sample Output 1:

0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0

 */