import java.util.Stack;

public class Basic{
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);

        // peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size of stack is : "+ st.size());

        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

        // IsEmpty
        System.out.println(st.isEmpty());

    }
}