import java.util.ArrayList;

class ImplementMinHeap {
    private ArrayList<Integer> heap;

    public void initializeHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int key) {
        heap.add(key);
        upHeap(heap.size() - 1);
    }

    public void changeKey(int index, int newVal) {
        if (index >= heap.size() || index < 0) return;
        
        int oldVal = heap.get(index);
        heap.set(index, newVal);
        
        // If new value is smaller, bubble up
        if (newVal < oldVal) {
            upHeap(index);
        }
        // If new value is larger, bubble down
        else if (newVal > oldVal) {
            downHeap(index);
        }
        // If equal, no change needed
    }

    public void extractMin() {
        if (heap.isEmpty()) return;
        
        // Move last element to root
        int lastElement = heap.remove(heap.size() - 1);
        
        // If heap still has elements, restore heap property
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            downHeap(0);
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int getMin() {
        if (heap.isEmpty()) return -1; // or throw exception
        return heap.get(0);
    }

    public int heapSize() {
        return heap.size();
    }

    // Helper methods from your original implementation
    private void upHeap(int index) {
        if (index == 0) return;
        int parentIndex = parent(index);
        if (heap.get(index) < heap.get(parentIndex)) {
            swap(index, parentIndex);
            upHeap(parentIndex);
        }
    }

    private void downHeap(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int min = index;

        if (left < heap.size() && heap.get(left) < heap.get(min)) {
            min = left;
        }
        if (right < heap.size() && heap.get(right) < heap.get(min)) {
            min = right;
        }
        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public static void main(String[] args) {
        ImplementMinHeap minHeap = new ImplementMinHeap();
        minHeap.initializeHeap();
        
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);
        minHeap.insert(4);
        
        System.out.println("Min: " + minHeap.getMin()); // Should print 1
        System.out.println("Heap Size: " + minHeap.heapSize()); // Should print 5
        
        minHeap.changeKey(2, 0); // Change value at index 2 to 0
        System.out.println("Min after changeKey: " + minHeap.getMin()); // Should print 0
        
        minHeap.extractMin();
        System.out.println("Min after extractMin: " + minHeap.getMin()); // Should print 1
        System.out.println("Heap Size after extractMin: " + minHeap.heapSize()); // Should print 4
    }
}
