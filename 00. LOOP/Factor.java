import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        // Checking the highest factor
        // int hf = 1;
        // for(int i=1; i<num; i++){
        //     if(num%i==0){
        //         hf = i;
        //     }
        // }
        // System.out.println("The highest factor without n itself is : " + hf);

        // Check the no is composite or not
        // for(int i=2; i<num; i++){
        //     if(num%i==0){
        //         System.out.println("This is composite no.");
        //         break;
        //     }
        // }

        // Check the no is composite or prime
        boolean isPrime = false;
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime = true;
                break;
            }
        }
        if(num==1) System.out.println("Neither prime nor composite");
        else if(isPrime == false) System.out.println("Prime number");
        else System.out.println("Composite number");

        sc.close();
    }
}
