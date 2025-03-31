public class LL_Queue_Impl {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class queueLL{
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

        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
