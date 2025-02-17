import java.util.Scanner;

public class Combination_Permutation {
    
    public static int fact(int x){
        int xfact = 1;
        for(int i=1; i<=x; i++){
            xfact = xfact * i;
            
        }
        return xfact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        // Combination
        int ncr = fact(n)/(fact(r) * fact(n-r));
        System.out.println("The combination is : " + ncr);

        // Permutation
        int ncp = fact(n) / (fact(n-r));
        System.out.println("The permutation is : " + ncp);

        sc.close();
    }
}
