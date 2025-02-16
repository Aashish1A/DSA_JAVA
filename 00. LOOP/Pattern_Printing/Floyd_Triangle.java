package Pattern_Printing;
import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        // int a = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(a + " ");
        //         // if(a<10) System.out.print(" ");
        //         a += 1;
        //     }
        //     System.out.println();
        // }

        // 0 & 1 triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               if(i%2!=0 && j%2!=0){
                System.out.print("1 ");
               }
               else if(i%2==0 && j%2==0){
                System.out.print("1 ");
               }
               else{
                System.out.print("0 ");
               }
            }
            System.out.println();
        }
        sc.close();
    }
}
