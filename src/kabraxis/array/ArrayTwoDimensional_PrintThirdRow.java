package kabraxis.array;
/*
The third row
You need to implement printTheThirdRow method. It should print the third row of the twoDimArray. The elements should be separated by space.

It is guaranteed that twoDimArray has at least 3 rows.
 */

public class ArrayTwoDimensional_PrintThirdRow {
    public static void main(String[]  args) {
        int[][] twoDimArray = {
                /*    j  [0]  [1]  [2]  [3]  [4] */
                /*i[0]*/{1, 2, 3, 4, 5},
                /*[1]*/ {8, 7, 8, 9, 10},
                /*[2]*/ {11, 12, 13, 14, 15},
                /*[3]*/ {16, 17, 18, 19, 20},
                /*[4]*/ {21, 22, 23, 24, 25}
        };
        printTheThirdRow(twoDimArray);

    }

    private static void printTheThirdRow(int[][] twoDimArray) {
        final int rowToPrintIndex = 2;
        for (int i = rowToPrintIndex; i == rowToPrintIndex; i++) {
            for (int j = 0; j < twoDimArray[1].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
        }
    }

}



