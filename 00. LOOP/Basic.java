import java.util.*;

public class Basic{
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter first number : ");
       int num = sc.nextInt();

       System.out.print("Enter second number : ");
       int num1 = sc.nextInt();

       for(int i=num; i<=num1; i++){
        System.out.println(i);
       }

       // Check even running 50 times loop
       for(int i=2; i<=100; i+=2){
        System.out.println(i);
       }

       // Check even running 100 times loop
       for(int i=1; i<100; i++){
        if(i%2==0){
            System.out.println(i);
        }
       }
       
       sc.close();
    }
}