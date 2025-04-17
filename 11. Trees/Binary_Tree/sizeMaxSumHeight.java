public class sizeMaxSumHeight {

    public static class Node{
        int data; // 0
        Node left; // null
        Node right; // null

        Node(int data){
            this.data = data;
        }
    }

    // Finding size of tree
    public static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // Sum of tree
    public static int sumOfTree(Node root){
        if(root==null) return 0;
        return root.data + sumOfTree(root.left) + sumOfTree(root.right);
    }

    // Product of tree
    public static int productOfTree(Node root){
        if(root==null) return 0;
        return 1 * productOfTree(root.left) * productOfTree(root.right);
    }

    // Max value in tree
    public static int maxValue(Node root){
       if(root==null) return 0;
       return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
    }

    // Min value in tree
    public static int minValue(Node root){
        if(root==null) return 0;
        return Math.min(root.data, Math.min(minValue(root.left), minValue(root.right)));
    }

    // Finding height of tree
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
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
        System.out.println(productOfTree(root));
        System.out.println(maxValue(root));
        System.out.println(minValue(root));
        System.out.println(height(root));
    }
}
