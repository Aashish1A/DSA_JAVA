package Binary_Search_Tree;

public class implementation {

    public static class Node{
        int data; // 0
        Node left; // null
        Node right; // null

        Node(int data){
            this.data = data;
        }
    }

    // Searching in BST
    public static boolean search(Node root, int target){
        if(root==null) return false;
        if(root.data == target) return true;
        if(root.data > target) return search(root.left, target);
        if(root.data < target) return search(root.right, target);
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(9);
        Node a = new Node(6);
        Node b = new Node(15);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(7);
        a.left = c;
        a.right = d;
        Node e = new Node(10);
        b.left = e;

        System.out.println(search(root, 9));
    }
}
