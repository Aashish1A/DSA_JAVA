import java.util.Scanner;

public class Print1to100 {
    public static void main(String[] args) {

        // Print table of 19
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int num = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num + " " + "X" + " " + i + " " + "=" + " " + num * i);
        // }
        // sc.close();

        // Check the number divisible by 3,5 but not by 9
        // for(int i=1; i<=50; i++){
        //     if(i%3==0 && i%5==0 && i%9!=0){
        //         System.out.println(i);
        //     }
        // }

        // Printing no in 10 to 1
        // for(int i=10; i>=1; i--){
        //     System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        // Display this AP - 1,3,5,7,9.. up to "n" terms
        for(int i=1; i<=2*n-1; i+=2){
            System.out.print(i+" ");
        }

        // Display this AP - 4,7,10,13.. up to n terms
        for(int i=4; i<=3*n+1; i+=3){
            System.out.print(i + " ");
        }
        System.out.println("Another way to do this question");
        int a=4, d=3;
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            a += d;
        }

        // Display this AP - 3,7,11,15,19.. up to n terms
        // int a=3, d=4;
        // for(int i=1; i<=n; i++){
        //     System.out.print(a + " ");
        //     a += d;
        // }
        sc.close();
    }
}
