package dwolf.collections.array_list;

import java.util.ArrayList;

class ArrayListsBasics {
    public static void main(String[] args) {
        // no argument constructor (it's empty, but its initial capacity is 10)
        ArrayList<String> list = new ArrayList<>();

        // specify initial capacity
        ArrayList<String> listInitialCapacity50 = new ArrayList<>(50);

        // ArrayList consisting of another ArrayList
        ArrayList<String> consistOfAnotherList = new ArrayList<>(list);

        // empty collection of strings
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size()); // 0

        names.add("David"); // [David]
        names.add("Alex"); // [David, Alex]
        names.add(1, "Ayoub"); // [David, Ayoub, Alex]
        names.add(0, "Anwar"); // [Anwar, David, Ayoub, Alex]
        names.set(3, "Maike"); // [Anwar, David, Ayoub, Maike]

        System.out.println(names); // [Anwar, David, Ayoub, Maike]
        System.out.println(names.size()); // 4
        System.out.println(names.get(0)); // [David]
        System.out.println(names.get(3)); // [Maike]

        names.remove("David"); // [Anwar, Ayoub, Maike] (removes 1 occurrence)
        names.remove(1); // [Anwar, Maike]
        names.clear(); // []

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(25);

        // remove the object 1, since nums.remove(1) would match the index instead.
        nums.remove(Integer.valueOf(1)); // [25]
        System.out.println(nums);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(100);
        nums2.addAll(nums);
        System.out.println(nums2.contains(2)); // true
        System.out.println(nums2.contains(4)); // false
        System.out.println(nums2.indexOf(1)); // first occurrence
        System.out.println(nums2.lastIndexOf(1)); // last occurrence
        System.out.println(nums2.lastIndexOf(4)); // // -1 since not found

        System.out.println("\n");

        ArrayList<Long> powersOfTen = new ArrayList<>();

        // add values to a list, using for loop
        int count = 5;
        for (int i = 0; i < count; i++) {
            long power = (long) Math.pow(10,i);
            powersOfTen.add(power);
        }

        // read values from a list, using for loop
        for (int i = 0; i < powersOfTen.size(); i++) {
            System.out.print(powersOfTen.get(i) + " ");
        }

        System.out.println("\n");

        // read values from a list, using for each loop
        for (long value : powersOfTen) {
            System.out.print(value + " ");
        }

    }
}
