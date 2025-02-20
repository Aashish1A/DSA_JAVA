package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    // public static void reverseList(ArrayList<Integer> l1){
    //     int i = 0, j = l1.size() - 1;
    //     while(i<j){
    //         Integer temp = Integer.valueOf(l1.get(i));
    //         l1.set(i, l1.get(j));
    //         l1.set(j, temp);
    //         i++;
    //         j--;
    //     }
    // }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(); 

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println("Original list : " + l1);
        // reverseList(l1);

        Collections.reverse(l1);
        System.out.println("Revered list : " + l1);

        Collections.sort(l1);
        System.out.println("Ascending order : " + l1);
        
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending order : " + l1);
    }
}
