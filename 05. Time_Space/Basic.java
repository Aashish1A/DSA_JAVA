import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {

        // WAP to find sum of given number and find the time complexity.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        //first approach
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum  = sum + i;
        }
        System.out.println("The sum of given no is : " + sum);

        // second approach
        int ans = n*(n+1)/2;
        System.out.print("The sum of given no is : " + ans);

        sc.close();
    }
}