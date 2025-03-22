import java.util.Stack;

public class reverseStack {

    public static void reverseStackRec(Stack <Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top + " ");
        reverseStackRec(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        // reverseStackRec(st);

        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }

        Stack <Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println("The reverse stack is : " + st);

    }
}
