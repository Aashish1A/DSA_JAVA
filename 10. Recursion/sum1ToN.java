public class sum1ToN {

    static void sum(int n, int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1, s+n);
        return;
    }

    static int sum(int n){
        if(n==1) return 1;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        sum(5, 0);
        System.out.println(sum(5));
    }
}
