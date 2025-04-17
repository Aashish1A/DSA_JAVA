public class diameterOfTree {
    public static class Node {
        int data; // 0
        Node left; // null
        Node right; // null

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameterOfBinaryTree(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if(root.left!=null) mid++;
        if(root.right!=null) mid++;
        int max = Math.max(leftAns, Math.max(rightAns, mid));
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.left = e;
        Node f = new Node(7);
        Node g = new Node(8);
        d.left = f;
        d.right = g;

        System.out.println(diameterOfBinaryTree(root));
    }
}
