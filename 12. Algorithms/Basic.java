public class Basic{
    public static void main(String[] args) {
        int[] arr = {6,1,7,3,2,5,4,8,9,9,10};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        int sumOfNum = (n*(n+1))/2;
        int duplicates = sum - sumOfNum;
        System.out.println("The duplicates value is : " + duplicates);
        
    }
}