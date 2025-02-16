import java.util.Scanner;

public class BuiltInFn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // System.out.println(Math.pow(3, 5));
        // System.out.println(Math.sqrt(4));
        // System.out.println(Math.cbrt(1000));
        // System.out.println(Math.floor(3.14));
        // System.out.println(Math.min(12,14));
        // System.out.println(Math.max(12,14));

        
        System.out.println(Math.max(a, Math.max(b,c)));

        sc.close();
    }
}