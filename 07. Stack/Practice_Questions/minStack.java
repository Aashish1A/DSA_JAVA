package Practice_Questions;

import java.util.Stack;

public class minStack {

    class MinStack {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();

        public void push(int val) {
            if(st.size()==0){
                st.push(val);
                min.push(val);
            }else{
                st.push(val);
                if(min.peek()<val) min.push(min.peek());
                else min.push(val);
            }
        }

        public void pop() {
            st.pop();
            min.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }

    public static void main(String[] args) {
        
    }
}
