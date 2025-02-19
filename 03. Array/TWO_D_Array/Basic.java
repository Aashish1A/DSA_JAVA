package TWO_D_Array;

public class Basic {
    public static void main(String[] args) {

        // int[][] arr = new int[2][3];
        // arr[0][0] = 1;
        // arr[0][1] = 2;
        // arr[1][0] = 3;
        // arr[0][1] = 4;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
