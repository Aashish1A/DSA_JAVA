public class dequeImplUsingArr {
    public static class dequeArr {
        int[] arr = new int[50];
        int f = -1;
        int r = -1;
        int size = 0;

        void addFirst(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) { // First element
                f = r = 0;
            } else if (f > 0) { 
                f--;
            } else { // Shift elements to make space
                for (int i = r; i >= f; i--) {
                    arr[i + 1] = arr[i];
                }
                r++;
            }
            arr[f] = val;
            size++;
        }

        void addLast(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1) { // First element
                f = r = 0;
            } else {
                r++;
            }
            arr[r] = val;
            size++;
        }

        int removeFirst() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int val = arr[f];
            if (f == r) { // If only one element was present
                f = r = -1;
            } else {
                f++;
            }
            size--;
            return val;
        }

        int removeLast() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[r];
            if (f == r) {
                f = r = -1;
            } else {
                r--;
            }
            size--;
            return val;
        }

        int getFirst() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }

        int getLast() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[r];
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dequeArr d = new dequeArr();
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
        System.out.println("First element: " + d.getFirst());
        System.out.println("Last element: " + d.getLast());
        System.out.println("Size: " + d.size());
    }
}