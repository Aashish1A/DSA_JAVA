import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // Display this GP - 1,2,4,8,16,32.. up to n terms
        // int a=1, r=2;
        // for(int i=1; i<=num; i++){
        //     System.out.print(a + " ");
        //     a *= r;
        // }

        // Display this GP - 3,9,27,81,243.. up to n terms
        int a=3, r=3;
        for(int i=1; i<=num; i++){
            System.out.print(a + " ");
            a *= r;
        }

        sc.close();
    }
}
