package Array;

public class ArrayAndMethods_CompareArrays {
    public static void main(String[] args) {

        int[] first = {2, 4, 6, 8, 10};
        int[] second = {2, 4, 6, 8, 10};

//if whatever the method equals does is true/false related to the data (first, second)
//we passed to the method then do something
        if (equals(first, second)) {
            System.out.println("Same array");
        } else {
            System.out.println("Different array");
        }

    }

    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}

