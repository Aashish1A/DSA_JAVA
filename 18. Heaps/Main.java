import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
        try {
            heap.insert(5);
            heap.insert(3);
            heap.insert(8);
            heap.insert(1);
            heap.insert(4);

            // System.out.println("Removed: " + heap.remove()); // Should print 1
            // System.out.println("Removed: " + heap.remove()); // Should print 3
            // System.out.println("Removed: " + heap.remove()); // Should print 4

            ArrayList<Integer> list = heap.heapSort();
            System.out.println(list);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}