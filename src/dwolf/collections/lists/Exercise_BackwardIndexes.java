package dwolf.collections.lists;

import java.util.List;
import java.util.Arrays;

public class Exercise_BackwardIndexes {
    public static void main(String[] args) {
        int index = -6;
        List<Integer> lst = Arrays.asList(7, 6, 5, 4, 3, 2);
//        System.out.println(lst.get((index / -1) - 1));
        System.out.println(getElementByIndex(lst, index));
    }

    static <T> T getElementByIndex(List<T> lst, int index) {
        return lst.get(index > 0 ? index : lst.size() + index);
    }

    static void testConcepts() {
        int index = -6;
        int[] arr = {7, 6, 5, 4, 3, 2};
        System.out.print(arr[(index / -1) - 1] + " ");
        index = -5;
        System.out.print(arr[(index / -1) - 1] + " ");
        index = -4;
        System.out.print(arr[(index / -1) - 1] + " ");
        index = -3;
        System.out.print(arr[(index / -1) - 1] + " ");
        index = -2;
        System.out.print(arr[(index / -1) - 1] + " ");
        index = -1;
        System.out.print(arr[(index / -1) - 1] + " ");
    }
}
