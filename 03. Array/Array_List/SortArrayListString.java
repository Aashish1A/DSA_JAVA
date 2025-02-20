package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Welcome");
        list.add("to");
        list.add("my");
        list.add("World");

        System.out.println("Original list : " + list);

        Collections.sort(list);
        System.out.println(list);

    }
}
