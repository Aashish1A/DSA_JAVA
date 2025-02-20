package TWO_D_Array;

public class Transpose {
  public static void main(String[] args) {
    int[][] arr = {{2,3,4}, {1,2,3}, {5,4,6}};
    int n = arr.length;

    int[][] brr = new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            // System.out.print(arr[j][i] + " ");
            brr[i][j] = arr[j][i];
        }
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(brr[i][j] + " ");
        }
        System.out.println();
    }
  }
}
