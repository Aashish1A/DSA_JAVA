public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,1,7,3,2,5,4,8,9,9,10};
        int n = arr.length;
        System.out.println("Original Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<n-1; i++){
            boolean flag = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag==true) break;
        }

        System.out.println();
        System.out.println("Sorted Array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}