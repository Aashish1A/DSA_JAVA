// import java.util.Scanner;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        // WAP to count digits of a given number.
        int count = 0;
        if(n==1) count++;
        while(n!=0){
            n = n / 10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
