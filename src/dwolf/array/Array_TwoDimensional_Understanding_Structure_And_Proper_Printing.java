package dwolf.array;

public class Array_TwoDimensional_Understanding_Structure_And_Proper_Printing {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 2};
        System.out.println("len: " + arr.length);
        char[][] arr2 =
//              j 0v j 1v j 2v j 3v        j 0v j 1v        j 0v j 1v j 2v j 3v        j 0v
                {{'~', '~', '~', '~'},      {'~', '~'},      {'~', '~', '~', '~'},      {'~'}};
//               ^       i 0        ^       ^   i 1  ^       ^       i 2        ^       ^i 3^

        printArr(arr2);

    }

    public static void printArr(char[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}