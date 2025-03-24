import java.util.Scanner;

public class MenuDrivenDoublyCircularLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class DoublyCircularLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Insert at beginning
        void insertAtBeg(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
                head.next = head;
                head.prev = head;
            } else {
                temp.next = head;
                head.prev = temp;
                temp.prev = tail;
                tail.next = temp;
                head = temp;
            }
            size++;
        }

        // Insert at end
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                insertAtBeg(data);
                return;
            }
            temp.next = head;
            head.prev = temp;
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
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
            if (idx == size) {
                insertAtEnd(data);
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }

        // Delete head
        void deleteHead() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.next == head) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            size--;
        }

        // Delete tail
        void deleteTail() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head.next == head) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
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
            if (idx == size - 1) {
                deleteTail();
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
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
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
                if (temp == head) { // Stop when we complete the circle
                    break;
                }
            }
            System.out.println("(Back to Head)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();

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
                    dcll.insertAtBeg(begVal);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int endVal = sc.nextInt();
                    dcll.insertAtEnd(endVal);
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value: ");
                    int idxVal = sc.nextInt();
                    dcll.insertAtIdx(idx, idxVal);
                    break;
                case 4:
                    dcll.deleteHead();
                    break;
                case 5:
                    dcll.deleteTail();
                    break;
                case 6:
                    System.out.print("Enter index to delete: ");
                    int delIdx = sc.nextInt();
                    dcll.deleteAtIdx(delIdx);
                    break;
                case 7:
                    dcll.display();
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