import java.util.Arrays;

public class countSort {

    public static void sort(int[] array){
        if(array == null || array.length <= 1) return;

        // 1. Find the largest element in the array to determine count array size
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }

        // 2. Create a count array of size max + 1 (to store frequency of each number)
        int[] countArray = new int[max + 1];

        // 3. Populate the count array by incrementing at index equal to array element
        for(int num : array){
            countArray[num]++;
        }

        // 4. Reconstruct the original array from the count array
        int index = 0;
        for(int i = 0; i <= max; i++){ // ✅ i <= max to include the largest number
            while(countArray[i] > 0){
                array[index++] = i;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 3, 2, 1, 4, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
