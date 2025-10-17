package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the pyramid");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num =1;
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
                }
                for(int k=0; k<(2*i+1); k++ ){
                    System.out.print(num);
                    num++;
                }
                System.out.println();
        }
        for(int i=n; i>=0; i--){
          int  num=1;
            
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
                }
                for(int k=0; k<(2*i+1); k++ ){
                    System.out.print(num);
                    num++;
                }
                System.out.println();
        }
    }
}
