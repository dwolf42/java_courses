package kabraxis.array;
//Sequential Search will return the first element in the array that matches

public class ArrayAndMethods_SequentialSearch {
    public static void main(String[] args){
                //      0   1   2   3   4   5   6   7   8
        int[] array = { 45, 67, 23, 50, 1, 505, 54, 40, 90 };

        System.out.println(search(array,505));

        //better looking way to report the index

        int index = search(array, 505);

        if (index > -1) {
            System.out.println("Item found on index " + index);
        } else {
            System.out.println("Item not found");
        }
    }

    public static int search(int[] x, int key) {

        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                return i;
            }
        }
        return -1;
    }


}
