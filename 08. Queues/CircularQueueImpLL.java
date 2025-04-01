public class CircularQueueImpLL {

    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
        }
    }

    public static class Cql{
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val){
            Node temp = new Node(val);
            if(size()==0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size()==0) return false;
            else return true;
        }

        void display(){
            if(size()==0){
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Cql cl = new Cql();
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.display();
        cl.remove();
        cl.display();
        System.out.println(cl.peek());
        System.out.println(cl.size());
    }
}