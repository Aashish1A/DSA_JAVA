package Practice_Question;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        // int originalNum = num;

        int rev = 0;
        while(num != 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;                                                                                                                                                            
        }

        // ---Checking palindrome ---
        // if(originalNum == rev){
        //     System.out.println("Number is palindrome");
        // }
        // else{
        //     System.out.println("Number is not Palindrome");
        // }


        // Printing reverse of a number
        System.out.println("The reverse of given no is : " + rev);

        sc.close();
    }
}
