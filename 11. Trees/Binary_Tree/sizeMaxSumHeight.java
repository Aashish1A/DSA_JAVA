public class sizeMaxSumHeight {

    public static class Node{
        int data; // 0
        Node left; // null
        Node right; // null

        Node(int data){
            this.data = data;
        }
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int sumOfTree(Node root){
        if(root==null) return 0;
        return root.data + sumOfTree(root.left) + sumOfTree(root.right);
    }

    public static int maxValue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
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
        b.right = e;
        System.out.println(size(root));
        System.out.println(sumOfTree(root));
        System.out.println(maxValue(root));
        System.out.println(height(root));
    }
}
