public class preInPost {

    public static void preInPosts(int n){
        if(n==0) return;
        System.out.println("Pre : " + n);
        preInPosts(n-1);
        System.out.println("In : " + n);
        preInPosts(n-1);
        System.out.println("Post : " + n);
        return;
    }

    public static void main(String[] args) {
        preInPosts(2);
    }
}
