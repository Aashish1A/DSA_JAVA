public class zigzagLevelTraversal {

    public static class Node{
        int data; // 0
        Node left; // null
        Node right; // null

        Node(int data){
            this.data = data;
        }
    }

     // Find nth level elements
     public static void nthLevel(Node root, int n){ // left to right
        if(root==null) return;
        if(n==1){
            System.out.print(root.data + " ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    public static void nthLevel2(Node root, int n){ // right to left
        if(root==null) return;
        if(n==1){
            System.out.print(root.data + " ");
            return;
        }
        nthLevel(root.right, n-1);
        nthLevel(root.left, n-1);
    }

    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node a = new Node(9);
        Node b = new Node(20);
        root.left = a;
        root.right = b;
        Node c = new Node(15);
        Node d = new Node(7);
        b.left = c;
        b.right = d;
        int level = height(root) + 1;
        for(int i=1; i<=level; i++){
            if(i%2!=0) nthLevel(root, i);
            else nthLevel2(root, i);
        }
    }
}
