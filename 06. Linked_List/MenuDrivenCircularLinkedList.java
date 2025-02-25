import java.util.Scanner;

public class MenuDrivenCircularLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CircularLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Insert at beginning
        void insertAtBeg(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
                tail.next = head;
            } else {
                temp.next = head;
                head = temp;
                tail.next = head;
            }
            size++;
        }

        // Insert at end
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
                tail.next = head;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }

        // Insert at index
        void insertAtIdx(int idx, int data) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid index");
                return;
            }
            if (idx == 0) {
                insertAtBeg(data);
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        // Delete at head
        void deleteHead() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
            tail.next = head;
            size--;
        }

        // Delete at tail
        void deleteTail() {
            if (head == null || head.next == head) {
                head = null;
                tail = null;
                size = 0;
                return;
            }
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            size--;
        }

        // Delete at index
        void deleteAtIdx(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return;
            }
            if (idx == 0) {
                deleteHead();
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        // Display list
        void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (true) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
                if (temp == head) break;
            }
            System.out.println("(Back to Head)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at index");
            System.out.println("4. Delete head");
            System.out.println("5. Delete tail");
            System.out.println("6. Delete at index");
            System.out.println("7. Display list");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int begVal = sc.nextInt();
                    cll.insertAtBeg(begVal);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int endVal = sc.nextInt();
                    cll.insertAtEnd(endVal);
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value: ");
                    int idxVal = sc.nextInt();
                    cll.insertAtIdx(idx, idxVal);
                    break;
                case 4:
                    cll.deleteHead();
                    break;
                case 5:
                    cll.deleteTail();
                    break;
                case 6:
                    System.out.print("Enter index to delete: ");
                    int delIdx = sc.nextInt();
                    cll.deleteAtIdx(delIdx);
                    break;
                case 7:
                    cll.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}