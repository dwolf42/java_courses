package dwolf.laboratory.Sam;

public class Test {
    public static void main(String[] args) {
        //             0  1  2....
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // for each loop / enhanced loop
        for (int integer : array) {
            System.out.println("Inter is: " + integer);
        }

        // for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hi i:" + array[i]);
        }
    }
}
