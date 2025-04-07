public class increasingParameter {

    // Parameterized
    static void increasing(int x, int n){
        if(x>n) return;
        System.out.println(x);
        increasing(x+1, n);
        return;
    }

    // Recursive Call
    static void increasing(int n){
        if(n==0) return;
        increasing(n-1);
        System.out.println(n);
        return;
    }

    public static void main(String[] args) {
        // increasing(1, 10);
        increasing(5);
    }
}
