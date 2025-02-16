package Pattern_Printing;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the no of rows and columns : ");
         int rows = sc.nextInt();
         int columns = sc.nextInt();

         for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
         sc.close();
    }
}
