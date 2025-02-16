package Practice_Question;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of a given no is : " + fact);

        // Print the factorials of first n numbers.
        

        sc.close();
    }
}
