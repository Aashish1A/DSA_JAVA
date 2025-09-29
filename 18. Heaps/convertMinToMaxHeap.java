import java.util.Arrays;

public class convertMinToMaxHeap {
    public int[] minToMaxHeap(int[] nums) {
        int n = nums.length;

        // Start from last non-leaf node and heapify each node
        for (int i = (n - 2) / 2; i >= 0; i--) {
            maxHeapify(nums, n, i);
        }

        return nums;
    }

    private void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap and continue heapifying
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        convertMinToMaxHeap converter = new convertMinToMaxHeap();
        int[] minHeapArray = {1, 3, 2, 7, 6, 4, 5};
        int[] maxHeapArray = converter.minToMaxHeap(minHeapArray);
        System.out.println(Arrays.toString(maxHeapArray)); // Should print a valid max-heap
    }
}

