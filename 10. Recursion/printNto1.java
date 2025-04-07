public class printNto1 {

    static int decreasing(int n){
        if(n==1) return 1;
        System.out.println(n);
        return decreasing(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(decreasing(10));
    }
}
