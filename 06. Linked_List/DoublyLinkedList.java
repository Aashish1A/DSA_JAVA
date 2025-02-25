import java.util.Scanner;

public class DoublyLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    // Display the linked list
    public static void displayAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display in reverse order
    public static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Insert at the beginning
    public static Node insertAtBeg(Node head, int data) {
        Node t = new Node(data);
        t.next = head;
        if (head != null) {
            head.prev = t;
        }
        return t;
    }

    // Insert at the tail
    public static void insertAtTail(Node head, int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(data);
        temp.next = t;
        t.prev = temp;
    }

    // Insert at a specific index
    public static void insertAtIdx(Node head, int idx, int data) {
        Node s = head;
        for (int i = 1; i < idx; i++) {
            if (s.next == null) {
                System.out.println("Index out of bounds!");
                return;
            }
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(data);
        s.next = t;
        t.prev = s;
        t.next = r;
        if (r != null) {
            r.prev = t;
        }
    }

    // Delete head node
    public static Node deleteHead(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    // Delete tail node
    public static void deleteTail(Node head) {
        if (head == null || head.next == null) {
            System.out.println("List is empty or has only one node!");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at index
    public static void deleteAtIdx(Node head, int idx) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds!");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("No node found at index " + idx);
            return;
        }
        temp.next = temp.next.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        int choice, data, index;

        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Display");
            System.out.println("2. Display Reverse");
            System.out.println("3. Insert at Beginning");
            System.out.println("4. Insert at End");
            System.out.println("5. Insert at Index");
            System.out.println("6. Delete Head");
            System.out.println("7. Delete Tail");
            System.out.println("8. Delete at Index");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Linked List:");
                    displayAll(head);
                    break;

                case 2:
                    System.out.println("Reverse Linked List:");
                    displayReverse(tail);
                    break;

                case 3:
                    System.out.print("Enter data to insert at beginning: ");
                    data = sc.nextInt();
                    head = insertAtBeg(head, data);
                    if (tail == null) {
                        tail = head;
                    }
                    break;

                case 4:
                    System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    insertAtTail(head, data);
                    break;

                case 5:
                    System.out.print("Enter index to insert at: ");
                    index = sc.nextInt();
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    insertAtIdx(head, index, data);
                    break;

                case 6:
                    System.out.println("Deleting Head...");
                    head = deleteHead(head);
                    if (head == null) {
                        tail = null;
                    }
                    break;

                case 7:
                    System.out.println("Deleting Tail...");
                    deleteTail(head);
                    break;

                case 8:
                    System.out.print("Enter index to delete at: ");
                    index = sc.nextInt();
                    deleteAtIdx(head, index);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
