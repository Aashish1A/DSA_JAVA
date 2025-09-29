import java.util.*;
public class SortKSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 7, 6};
        int k = 2;
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                result.add(minHeap.poll());
            }
        }
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }
        System.out.println(result);
    }
}
