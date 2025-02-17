package Practice_Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder reverse = new StringBuilder(str).reverse();

        if(str.toString().equals(reverse.toString())){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}
