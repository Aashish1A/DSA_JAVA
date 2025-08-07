public class Algo{

    public static int recBinarySearch(int[] arr, int tar, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2; // (start + end)/2

            if(tar > arr[mid]){
                return recBinarySearch(arr, tar, mid+1, end);
            }else if(tar < arr[mid]){
                return recBinarySearch(arr, tar, start, mid-1);
            }else{
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int tar){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2; // (start + end)/2

            if(tar > arr[mid]){
                start = mid + 1;
            }else if(tar < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1,0,3,4,5,9,12}; // odd
        int tar1 = 12;
        System.out.println(binarySearch(arr1, tar1));

        int[] arr2 = {-1,0,3,5,9,12}; // even
        int tar2 = 0;
        System.out.println(recBinarySearch(arr2, tar2, 0, arr2.length-1));

        // T.C -> o(log n) S.C -> o(1)
    }
}