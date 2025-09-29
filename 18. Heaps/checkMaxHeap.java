public class checkMaxHeap {
     public boolean isHeap(int[] nums) {
        int n = nums.length;

        // Only need to check internal nodes (till n/2 - 1)
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // If left child exists and is greater than parent → not heap
            if (left < n && nums[i] < nums[left]) {
                return false;
            }

            // If right child exists and is greater than parent → not heap
            if (right < n && nums[i] < nums[right]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkMaxHeap checker = new checkMaxHeap();
        int[] heapArray = {10, 9, 8, 7, 6, 5, 4};
        System.out.println("Is max-heap: " + checker.isHeap(heapArray)); // Should print true
    }
}
