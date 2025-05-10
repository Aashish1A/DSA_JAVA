public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {6,1,7,3,2,5,4,8,9,9,10};
        int n = arr.length;
        System.out.println("Original Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
        for(int i=1; i<=n-1; i++){
            int j = i;
            while(j>=1 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        System.out.println();
        System.out.println("Sorted Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
