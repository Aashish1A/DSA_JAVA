package Practice_Questions;

import java.util.HashMap;

public class frequencyElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int maxFreq = 0, ansKey = -1;
        for(var key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has maxFreq and it occurs %d times", ansKey, maxFreq);
    }
}
