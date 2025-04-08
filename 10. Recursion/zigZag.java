public class zigZag {

    public static void zigZags(int n){
        if(n==0) return;
        System.out.print(n +" ");
        zigZags(n-1);
        System.out.print(n + " ");
        zigZags(n-1);
        System.out.print(n + " ");
        return;
    }

    public static void main(String[] args) {
        zigZags(1);
        System.out.println();
        zigZags(2);
        System.out.println();
        zigZags(3);
    }
}
