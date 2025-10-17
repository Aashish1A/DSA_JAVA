package Pattern_Printing;

public class r{
    public static void rv(int arr[]){
        int n=arr.length;
        int j=0;
        for(int i=1; i<n; i++){
            if(arr[i-1]!=arr[i]){
                 if(i!=j)
                 j++;
                 arr[j]= arr[i];
        }
        }
        for(int i=0; i<=j ; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3,3,4,5,6,7};
        rv(arr);
    }
}
