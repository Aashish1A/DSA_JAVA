import java.util.Stack;

public class displayStack {

    public static void displayReverseRec(Stack <Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRec(st);
        st.push(top);
    }

    public static void displayStackRec(Stack <Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayStackRec(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // -------Using Extra Stack----------
        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x);
        }

        System.out.println();
        // ------Using Array ------------

        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }

    }
}
