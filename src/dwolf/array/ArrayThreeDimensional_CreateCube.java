package dwolf.array;

public class ArrayThreeDimensional_CreateCube {
    public static int[][][] createCube() {
        int[][][] cube = new int[3][3][3];
        int a = 0;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[1].length; j++) {
                for (int k = 0; k < cube[2].length; k++) {
                    cube[i][j][k] = a;
                    a++;
                }
            }
            a = 0;
        }
        return cube;
    }

    public static void main(String[] args) {
        int[][][] print = createCube();
        for (int i = 0; i < print.length; i++) {
            for (int j = 0; j < print[1].length; j++) {
                for (int k = 0; k < print[2].length; k++) {
                    System.out.print(print[i][j][k]);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
/*
You need to implement the createCube method. It should create a 3x3x3 three-dimensional array with the following content:

[0, 1, 2]	[3, 4, 5]	[6, 7, 8]
[0, 1, 2]	[3, 4, 5]	[6, 7, 8]
[0, 1, 2]	[3, 4, 5]	[6, 7, 8]
The elements should be of type int.

*/