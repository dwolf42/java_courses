package Array;

public class ArrayTwoDimensional_SwapColumns {
    public static void main(String[] args){
        int row = 3;
        int column = 4;
        int swap1 = 0;
        int swap2 = 1;

        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };

        int[][] swapMatrix = new int[row][column];
    }
}
/*
Swap the columns
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.
Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.

 Sample Input:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1


 Sample Output:

12 11 13 14
22 21 23 24
32 31 33 34
 */