package Practice_Questions;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = { 40, 56, 34, 23, 64, 45, 34 };

        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
