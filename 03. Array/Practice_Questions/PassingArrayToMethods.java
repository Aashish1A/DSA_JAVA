package Practice_Questions;

public class PassingArrayToMethods {

    public static void change(int[] arr){
        arr[1] = 34;
    }

    public static void swap(int[] a, int[] b){
        a[0] = a[0] + b[0];
        b[0] = a[0] - b[0];
        a[0] = a[0] - b[0];

        // int temp = a;
        // a = b;
        // b = temp;
    }

    public static void main(String[] args) {

        // int[] arr = {3,4,5,6,7};
        // System.out.println(arr[1]);
        // change(arr);
        // System.out.println(arr[1]);
        // arr[1] = 43;
        // System.out.println(arr[1]);

        // swap two number
        int a[] = {32};
        int b[] = {10};
        
        System.out.println(a[0] + " " + b[0]);
        swap(a, b);
        System.out.println(a[0] + " " + b[0]);
    }
}
