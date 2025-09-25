package Practice_Questions;
// import java.util.*;

import java.util.HashMap;

public class Frequency{
    // public static int[] findFrequency(int[] arr){
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
    //     int[] freq = new int[max + 1];
    //     for(int i=0; i<arr.length; i++){
    //         freq[arr[i]]++;
    //     }
    //     return freq;
    // }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        // int[] frequency = findFrequency(arr);
        // for(int i=0; i<frequency.length; i++){
        //     if(frequency[i] > 0){
        //         System.out.println("Element " + i + " occurs " + frequency[i] + " times.");
        //     }
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        for(var key : map.keySet()){
            System.out.println(key + " occurs " + map.get(key) + " times.");
        }
    }
}