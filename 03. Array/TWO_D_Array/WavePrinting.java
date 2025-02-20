package TWO_D_Array;

import java.util.Scanner;

public class WavePrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimension of first matrix
        System.out.print("Enter rows of first matrix : ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter cols of first matrix : ");
        int cols1 = scanner.nextInt();

        int[][] arr = new int[rows1][cols1];

        // Input first matrix
        System.out.println("Enter the elements of first matrix : ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Display result
        System.out.println("Wave of the matrices : ");
        for (int i = 0; i < rows1; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = rows1 - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
