public class stackUsingLL {

    public static class Node{ //User defined data type
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LLStack{ //User defined data structure
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;

            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;

            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.data;
        }

        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayRec(Node h){
            if(h==null) return;
            displayRec(h);
            System.out.print(h.data + " ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        System.out.println("Displaying the Stack : ");
        st.display();
        System.out.println("The size of stack is : " + st.size());
        st.pop();
        System.out.println("After Pop");
        st.display();
        st.push(12);
        System.out.println("After Push");
        st.display();
        st.push(14);
        st.push(10);
        st.display();
        st.push(11);
        st.display();
    }
}
