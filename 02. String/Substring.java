public class Substring {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(1));

        String str1 = "Physics";
        for(int j=2; j<4; j++){
            System.out.print(str1.substring(j));
        }
        System.out.println();

        // Print all subString of a string
        String s ="abcd";
        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(s.substring(i,j) + " ");
            }
        }
    }
}
