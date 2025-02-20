package TWO_D_Array;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimension of first matrix
        System.out.print("Enter rows of first matrix : ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter cols of first matrix : ");
        int cols1 = scanner.nextInt();

        // Input dimension of second matrix
        System.out.print("Enter rows of second matrix : ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter cols of second matrix : ");
        int cols2 = scanner.nextInt();

        // condition for matrix multiplication
        if(cols1 != rows2){
            System.out.println("Matrix multiplication is not possible.");
            scanner.close();
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2];

        // Input first matrix
        System.out.println("Enter the elements of first matrix : ");
        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols1; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter the elements of second matrix");
        for(int i=0; i<rows2; i++){
            for(int j=0; j<cols2; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication
        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols2; j++){
                result[i][j] = 0;
                for(int k=0; k<cols1; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Product of the matrices : ");
        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
