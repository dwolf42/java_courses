package Array;

public class Array_UsefulMethods {
    public static void main(String[] args){

        int[] numbers = { 2, 4, 6, 12, 24, 48 };

        System.out.println("Maximum is: " + max(numbers));
        System.out.println("Minimum is: " + min(numbers));
        System.out.println("Sum is: " + sum(numbers));
        System.out.println("Average is: " + avg(numbers));

    }

    public static int max(int[] x) {
        int temp = x[0];
        for (int i = 0; i < x.length; i++) {
            if (temp < x[i])
                temp = x[i];
        }
        return temp;
    }

    public static int min(int[] y) {
        int temp = y[0];
        for (int i = 0; i < y.length; i++) {
            if (temp > y[i])
                temp = y[i];
        }
        return temp;
    }

    public static int sum(int[] z) {
        int total = 0;
        for (int i = 0; i < z.length; i++) {
            total += z[i];
        }
        return total;
    }

    //Keep in mind: INT is a whole number, avg. is usually float/double!
    public static int avg(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total/a.length;
    }

}
