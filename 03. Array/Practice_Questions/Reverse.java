package Practice_Questions;


public class Reverse {

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7};
        int n = arr.length;

        // int[] reverse = new int[arr.length];
        // for(int i=0; i<n; i++){
        //     reverse[i] = arr[n - 1 - i];
        // }
        // System.out.println(Arrays.toString((reverse)));

       print(arr);
       int i=0, j=n-1;
       while(i<j){
        swap(arr, i, j);
        i++;
        j--;
       }
       print(arr);
        
    }
}
