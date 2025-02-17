import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " " + b);
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " " + b);
        sc.close();
    }
}
