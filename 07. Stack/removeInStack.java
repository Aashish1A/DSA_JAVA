import java.util.Stack;

public class removeInStack {
    public static void main(String[] args) {

        // -------Deletion at bottom---------
        System.out.println("Deletion at Bottom");
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack <Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);

        // -------Deletion at Index----------
        System.out.println("Deletion at Index ");

        Stack <Integer> lt = new Stack<>();
        lt.push(1);
        lt.push(2);
        lt.push(3);
        lt.push(4);
        System.out.println(lt);
        int idx = 2;

        Stack <Integer> temp = new Stack<>();
        while(lt.size()>idx+1){
            temp.push(lt.pop());
        }
        lt.pop();
        while(temp.size()>0){
            lt.push(temp.pop());
        }
        System.out.println(lt);
    }
}
