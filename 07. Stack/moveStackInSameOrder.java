// import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.print("Enter the no of element you want to insert : ");
        // n = sc.nextInt();
        // System.out.print("Enter the elements : ");
        // for(int i=1; i<=n; i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        // }

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        
        // Reverse order
        Stack <Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);

        // new stack
        Stack <Integer> rt  = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);

        // sc.close();
    }
}
