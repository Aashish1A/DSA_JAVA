public class stairPathCount {

    // Single step, double step
    static int stair(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return stair(n-1) + stair(n-2);
    }

    // Single step, double step, triple step
    static int stairs(int n){
        if(n<=3) return n;
        return stairs(n-1) + stairs(n-2) + stairs(n-3);
    }

    public static void main(String[] args) {
        System.out.println(stair(5));
        System.out.println(stairs(4));
    }
}
