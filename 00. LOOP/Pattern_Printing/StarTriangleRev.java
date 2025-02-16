package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        // First way
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i+j<=n) System.out.print(" " + " ");
        //         else System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Second way
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
