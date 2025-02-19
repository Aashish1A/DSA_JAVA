package TWO_D_Array;

import java.util.Scanner;

public class StoreMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[][] arr = new int[5][5];

        // Taking input
        // System.out.println("Enter 6 elements : ");
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // Displaying content
        int[][] arr = {{1,2}, {3,4}};
        int[][] brr = {{5,6},{7,8}};

        

        System.out.println("2D Array Elements Sum : ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + brr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
