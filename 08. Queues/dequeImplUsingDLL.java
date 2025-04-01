public class dequeImplUsingDLL {

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public static class dequeDLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        void addFirst(int val){
            Node temp = new Node(val);
            if(size()==0){
                head = tail = temp;
            }else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        void addLast(int val){
            Node temp = new Node(val);
            if(size()==0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int removeFirst() throws Exception{
            if(head==null){
                throw new Exception("Queue is empty");
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        int removeLast() throws Exception{
            if(head==null){
                throw new Exception("Queue is empty");
            }
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            int x = temp.data;
            temp.next=null;
            tail=temp;
            size--;
            return x;
        }

        int getFirst() throws Exception{
            if(head==null) 
                throw new Exception("Queue is empty");
            return head.data;
        }

        int getLast() throws Exception{
            if(head==null)
                throw new Exception("Queue is empty");
            return tail.data;
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
    }
    public static void main(String[] args) throws Exception{
        dequeDLL d = new dequeDLL();
        d.addFirst(5);
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.addLast(4);
        d.addFirst(6);
        d.addLast(7);
        d.display();
        d.removeFirst();
        d.display();
        d.removeLast();
        d.display();
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        System.out.println(d.size());
    }
}
