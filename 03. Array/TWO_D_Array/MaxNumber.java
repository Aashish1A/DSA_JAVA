package TWO_D_Array;

public class MaxNumber {
    public static void main(String[] args) {

        int[][] arr = {{1,0,1,1}, {0,1,0,1}, {1,0,0,1}};

        int maxCount = 0;
        int maxId = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount = count;
                maxId = i;
            }
        }
        System.out.println("The maximum count at " + maxId + " index");
    }
}


