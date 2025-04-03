package Practice_Questions;

import java.util.*;

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
        int k= sc.nextInt();
        // if (k > q.size() || k <= 0){
        //     System.out.println("Invalid value of k.");
        //     return;
        // }
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=k; i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=1; i<=q.size()-k; i++){
            q.add(q.remove());
        }
        System.out.println(q);

        sc.close();
    }
}
