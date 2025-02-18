import java.util.Scanner;

public class BasicLinearSearch_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter all the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = 5;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                flag = true;
                break;
            }
        }
        if(flag==false) System.out.println("Nhi mila");
        else System.out.println("Mil Gya");
        sc.close();
    }
}
