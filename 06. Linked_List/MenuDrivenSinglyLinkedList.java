import java.util.Scanner;

public class MenuDrivenSinglyLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Insert at beginning
        void insertAtBeg(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        // Insert at end
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
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
            if (head == tail) {
                head = tail = null;
            }else{
                head = head.next;
            }
            size--;
        }

        // Delete at tail
        void deleteTail() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            if (head == tail) {  // Only one node in the list
                head = tail = null;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
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
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
            size--;
        }

        // Return size
        void length(){
            System.out.println("The size of ll is : " + size);
        }

        // search by index
        void searchByIdx(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return;
            }
            
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            
            System.out.println("The value at index " + idx + " is: " + temp.data);
        }
        
        // search by value
        void searchByValue(int value) {
            Node temp = head;
            int index = 0;
        
            while (temp != null) {
                if (temp.data == value) {
                    System.out.println("The number " + value + " is found at index: " + index);
                    return;
                }
                temp = temp.next;
                index++;
            }
        
            System.out.println("The number " + value + " is not in the list.");
        }
        
        // Display list
        void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at index");
            System.out.println("4. Delete head");
            System.out.println("5. Delete tail");
            System.out.println("6. Delete at index");
            System.out.println("7. Display list");
            System.out.println("8. Display length");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int begVal = sc.nextInt();
                    ll.insertAtBeg(begVal);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int endVal = sc.nextInt();
                    ll.insertAtEnd(endVal);
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value: ");
                    int idxVal = sc.nextInt();
                    ll.insertAtIdx(idx, idxVal);
                    break;
                case 4:
                    ll.deleteHead();
                    break;
                case 5:
                    ll.deleteTail();
                    break;
                case 6:
                    System.out.print("Enter index to delete: ");
                    int delIdx = sc.nextInt();
                    ll.deleteAtIdx(delIdx);
                    break;
                case 7:
                    ll.display();
                    break;
                case 8:
                    ll.length();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}