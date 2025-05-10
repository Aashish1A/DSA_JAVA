public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {6,1,7,3,2,5,4,8,9,9,10};
        int n = arr.length;
        System.out.println("Original Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=i; j<=n-1; j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIdx = j;
                }
            }
            // swap the min and first element of sorted path
            // swap minIdx and i
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println();
        System.out.println("Sorted Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
