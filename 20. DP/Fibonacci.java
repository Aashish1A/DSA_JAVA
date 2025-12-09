import java.util.*;

public class Fibonacci{
    private static int fib(int n, List<Integer> dp){
        if(n <= 1) return n;
        if(dp.get(n) != -1) return dp.get(n);
        dp.set(n, fib(n-1, dp) + fib(n-2, dp));
        return dp.get(n);
    }
    public static void main(String[] args){
        int n = 6;
        List<Integer> dp = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            dp.add(-1);
        }
        System.out.println(fib(n, dp));
    }
}