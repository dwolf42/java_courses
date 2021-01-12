package Array;

public class ArrayThreeDimensional {
    public static void main(String[] args){
        int[][][] cubic = new int[3][4][5]; // a three-dimensional array (cube)

        int numToFill = 1; // it stores a value to fill elements

        for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
            for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") of 2-dim array of a "matrix"
                for (int k = 0; k < 5; k++) { // iterating through each element of a vector
                    cubic[i][j][k] = numToFill; // assign a value to an element
                }
            }
            numToFill++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
