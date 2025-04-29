package Binary_Search_Tree;
       
import java.util.LinkedList;
import java.util.Queue;

public class Pred_Successor {

    static int pred = -1;
    static int successor = -1;
    static Node temp = null;
    static boolean flag = false;

    public static class Node{
        int data; // 0
        Node left; // null
        Node right; // null

        Node(int data){
            this.data = data;
        }
    }
    public static Node constructBFS(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i<n-1){
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if(arr[i].equals("")) left = null;
            else{
                int l = Integer.parseInt(arr[i]);
                left.data = l;
                q.add(left);
            }
            if(arr[i+1].equals("")) right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.data = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }

    public static void inOrder(Node root, int val){
        if(root==null) return;
        inOrder(root.left,val);
        if(temp==null) temp = root;
        else{
            if(root.data==val){
                pred = temp.data;
                flag = true;
            }
            else if(root.data>val && flag == true){
                successor = root.data;
                flag = false;
            }else{
                temp = root;
            }
        }
        inOrder(root.right, val);
    }

    
    public static void main(String[] args) {
        String[] a = {"50","20","60","17","34","55","89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root = constructBFS(a);
        int val = 28;
        inOrder(root,val);
        System.out.println("Pred is : " + pred);
        System.out.println("Successor is : " + successor);
    }
}
