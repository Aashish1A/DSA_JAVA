package Pattern_Printing;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and columns : ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Hollow rectangle
        for(int i=1; i<=rows; i++){
           for(int j=1; j<=columns; j++){
               if((i==1 || i==rows) || (j==1 || j==columns)) System.out.print("* ");
               else System.err.print(" " + " ");
           }
           System.out.println();
        }

        // Star Cross
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                if((i==1 || i==rows) || (j==1 || j==columns)) System.out.print("* ");
                else System.err.print(" " + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
