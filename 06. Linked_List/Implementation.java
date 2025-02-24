public class Implementation {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        // Insert at end
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // Insert at Beginning
        void insertAtBeg(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // Insert at given index
        void insertAtIdx(int idx, int data){
            Node t = new Node(data);
            Node temp = head;

            if(idx==size){
                insertAtEnd(data);
                return;
            }else if(idx == 0){
                insertAtBeg(data);
                return;
            }else if(idx<0  || idx>size){
                System.out.println("Wrong index");
                return;
            }

            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;

            size++;
        }

        // Traverse and find the elements at given index
        int getAt(int idx){

            if(idx<0  || idx>size){
                System.out.println("Wrong index");
                return -1;
            }

            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        // length of a linkedList
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while(temp!=null){
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }

        // Delete at given index
        void deleteAtIdx(int idx){

            // Delete at beginning
            if(idx==0){
                head = head.next;
                size--;
                return;
            }

            Node temp = head;
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;

            size--;
        }   

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();

        System.out.println();
        ll.insertAtBeg(7);
        ll.display();

        System.out.println();
        ll.insertAtIdx(2, 17);
        ll.display();

        System.out.println();
        ll.insertAtIdx(4, 10);
        ll.display();

        System.out.println();
        // System.out.println(ll.tail.data);
        ll.deleteAtIdx(3);
        ll.display();

        System.out.println();
        ll.deleteAtIdx(0);
        ll.display();
        
    }
}