package Pattern_Printing;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Alphabet Square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
