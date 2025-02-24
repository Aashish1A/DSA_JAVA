public class BasicLinkedList{

    public static void displayR(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static void displayReverse(Node head){
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static class Node{
        int data; // value
        Node next; // address of next node
       
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        // System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5 -> 3 9 8 16
        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 -> 9 8 16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16

        // System.out.println(a); // $Node@2f92e0f4
        // System.out.println(a.next); // $Node@2f92e0f4
        // System.out.println(b); // $Node@2f92e0f4
        // System.out.println(c); // $Node@5305068a
        // System.out.println(d); // $Node@1f32e575
        // System.out.println(e); // $Node@279f2327 

        // display(a);
        // System.out.println();
        // displayR(a);
        // System.out.println();
        // displayReverse(a);

        System.out.print(length(a));

    }

}