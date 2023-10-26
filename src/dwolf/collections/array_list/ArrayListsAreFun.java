package dwolf.collections.array_list;

import java.util.ArrayList;
class ArrayListsAreFun {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("tree");
        list.add("leaf");
        list.add("bonfire");

        for (String str : list) {
            System.out.println(str);
        }
        list.remove("tree");
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
