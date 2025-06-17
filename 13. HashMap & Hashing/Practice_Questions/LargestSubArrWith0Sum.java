package Practice_Questions;

import java.util.HashMap;

public class LargestSubArrWith0Sum {

    static int zeroSumLargestSubArray(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        //prefixSum index
        int maxLen = 0, prefixSum = 0;
        map.put(0,-1);
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i]; 
            if(map.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i - map.get(prefixSum));
            }else{
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10};
        System.out.println(zeroSumLargestSubArray(arr, 0));
    }
}
