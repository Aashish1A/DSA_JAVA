package Practice_Questions;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {

    public static class QueueSt {
        Queue<Integer> q = new LinkedList<>();

        void push(int val) {
            q.add(val);
        }

        int pop() {
            for (int i = 1; i <= q.size() - 1; i++) {
                q.add(q.remove());
            }
            int x = q.remove();
            return x;
        }

        int top() {
            for (int i = 1; i <= q.size() - 1; i++) {
                q.add(q.remove());
            }
            int x = q.peek();
            q.add(q.remove());
            return x;
        }

        boolean empty() {
            if (q.size() == 0)
                return true;
            else
                return false;
        }
        
    }

    public static void main(String[] args) {
        QueueSt st = new QueueSt();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

    }
}
