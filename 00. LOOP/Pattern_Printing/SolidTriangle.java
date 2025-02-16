package Pattern_Printing;

import java.util.Scanner;

public class SolidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");      
        //     }
        //     System.out.println();
        // }

        // Alphanumeric Triangle
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if(i%2!=0){
        //             System.out.print(j + " ");
        //         }
        //         else{
        //             System.out.print((char)(j+64) + " ");
        //         }      
        //     }
        //     System.out.println();
        // }

        // For ulta solid rectangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(j + " ");      
            }
            System.out.println();
        }

        sc.close();
    }
}
