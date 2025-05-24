public class mergeSorts {
    public static void main(String[] args) {
        int[] arr = {6,1,7,3,2,5,4,8,9,9,10};
        int n = arr.length;

        System.out.println("Original Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, 0, n-1);

        System.out.println("Sorted Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // 1. Divide array into two parts, 2. Sort both parts via recursion, 3. Merge sorted parts
    static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);         // Sort left part
            mergeSort(arr, mid+1, right);      // Sort right part
            merge(arr, left, mid, right);      // Merge sorted parts
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++)
            L[i] = arr[left + i];
        for(int j=0; j<n2; j++)
            R[j] = arr[mid + 1 + j];

        int i=0, j=0, k=left;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while(i < n1) {
            arr[k++] = L[i++];
        }
        while(j < n2) {
            arr[k++] = R[j++];
        }
    }
}