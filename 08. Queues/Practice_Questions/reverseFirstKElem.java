package Practice_Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseFirstKElem {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first kth element to reverse : ");
        int idx = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<idx; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1; i<=idx-1; i++){
            q.add(q.remove());
        }
        System.out.println(q);

        sc.close();
    }
}
