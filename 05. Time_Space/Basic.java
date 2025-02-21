import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int ans = n*(n+1)/2;
        System.out.print("The sum of given no is : " + ans);

        sc.close();
    }
}