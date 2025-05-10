package Practice_Question;

public class pushZeroToEnd {
     public static void main(String[] args) {
        int[] arr = {6,0,7,3,0,5,0,0,9,9,10};

        // Move zero using extra array
        // int[] ans = new int[10];
        // int idx = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]!=0){
        //         ans[idx] = arr[i];
        //         idx++;
        //     }
        // }
        // while(idx!=ans.length){
        //     ans[idx] = 0;
        //     idx++;
        // }

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
