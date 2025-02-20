package Array_List;

import java.util.*;


public class Basic {
    public static void main(String[] args) {

        // wrapper class
        // Integer in = Integer.valueOf(4);
        // System.out.println(in);

        // Float f =  Float.valueOf(3.12f);
        // System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>(); 

        // add new elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index 1
        // System.out.println(l1.get(0));

        // print with for loop
        // for(int i=0; i<l1.size(); i++){
        //     System.out.println(l1.get(i) + " ");
        // }

        // printing the array list directly
        System.out.println(l1);

        // adding element at some index i
        l1.add(1, 100);
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        // checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        // if we don't specify class, we cam put anything inside l
        // ArrayList l = new ArrayList();
        // l.add("p");
        // System.out.println(l);

        int ind = l1.indexOf(6);
        System.out.println(ind);

        int ldx = l1.lastIndexOf(0);
        System.out.println(ldx);

    }
}
