import java.util.Stack;

public class insertionInStack {

    public static void pushAtBottom(Stack <Integer> st, int x){
        if(st.size()==0) st.push(x);
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    
    public static void main(String[] args) {

        // Insertion at Bottom
        System.out.println("Insertion at Bottom");

        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        
        st.push(5);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);


        // ---------- Insertion at Index -------------
        System.out.println("Insertion at Index ");

        Stack <Integer> lt = new Stack<>();
        lt.push(1);
        lt.push(2);
        lt.push(3);
        lt.push(4);
        System.out.println(lt);
        int idx = 2;
        int num = 12;

        Stack <Integer> temp = new Stack<>();
        while(lt.size()>idx){
            temp.push(lt.pop());
        }
        lt.push(num);
        while(temp.size()>0){
            lt.push(temp.pop());
        }
        System.out.println(lt);
    }
}
