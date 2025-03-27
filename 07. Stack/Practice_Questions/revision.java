package Practice_Questions;

import java.util.Stack;

public class revision {

    void copyStack(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        Stack <Integer> ct = new Stack<>();
        while(rt.size()>0){
            ct.push(rt.pop());
        }
    }

    void insertionAtBOttom(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print(st);
        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(5);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }

    void insertAtIndex(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print(st);
        int idx=2;
        int num = 6;
        Stack <Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        System.out.println(st);
        st.push(num);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }

    void display(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.println(x);
            st.push(x);
        }

        // Using array
        int n = st.size();
        int[] arr = new int[n];
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
            st.push(arr[i]);
        }
    }

    void displayRevRec(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        if(st.size()==0) return;
        int top = st.pop();
        System.out.println(top);
        displayRevRec();
        st.push(top);
    }

    void removeBottom(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack <Integer> db = new Stack<>();
        while(st.size()>1){
            db.push(st.pop());
        }
        System.out.println(st);
        st.pop();
        while(db.size()>0){
            st.push(db.pop());
        }
        System.out.println(st);
    }

    void removeAtIdx(){
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack <Integer> db = new Stack<>();
        int idx = 2;
        while(st.size()>idx+1){
            db.push(st.pop());
        }
        st.pop();
        while(db.size()>0){
            st.push(db.pop());
        }
        System.out.println(st);
    }

    
    public static class stack{
        int[] arr = new int[5];
        int idx = 0;

        void push(int val){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = val;
            idx++;
        }
    
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
    
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
    
        int size(){
            return idx;
        }

        void display(){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class StackLL{
        Node head = null;
        int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next= head;
            head = temp; 
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        void displayRec(Node h){
            if(h==null) return;
            displayRec(h);
            System.out.println(h.data + " ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
    }    
}