package Practice_Question;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        // WAP to print the sum of digits of a given no.
        // int sum = 0;
        // while(num != 0){
        //     int lastDigit= num % 10;
        //     sum += lastDigit;
        //     num = num / 10;
        // }
        // System.out.println("The sum of given number is : " + sum);
        // sc.close();

        // WAP to print sum of all even digits in a given no.
        int sum = 0;
        while(num != 0){
            int lastDigit= num % 10;
            if(num % 2==0){
                sum += lastDigit;
            }
            num = num / 10;
        }
        System.out.println("The sum of even number is : " + sum);
        sc.close();
    }
}
