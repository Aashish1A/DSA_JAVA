public class towerOfHanoi {

    static void tower(int n, char source, char helper, char destination){
        if(n==0) return;
        tower(n-1, source, destination, helper);
        System.out.println(source + "->" + destination);
        tower(n-1, helper, source, destination);
        return;
    }

    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
    }
}
