package Binary_Search_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class deletionLeafNode {

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

    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Delete leaf node
    public static void delete(Node root, int target){
        if(root==null) return;
        if(root.data>target){
            if(root.left==null) return;
            if(root.left.data == target){
                Node l = root.left; // l is that node i wish to delete
                if(l.left==null && l.right==null) root.left = null; // 0 Children
                else if(l.left==null || l.right==null){ // 1 children
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
                else{ // 2 children
                    Node curr = l;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root, pred.data);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else delete(root.left, target);
        }
        if(root.data<target){
            if(root.right==null) return;
            if(root.right.data==target){
                Node r = root.right; // r is the node we will delete
                if(r.right==null && r.left==null) root.right = null; // 0 children
                else if(r.right==null || r.left==null){ // 1 children
                    if(r.right!=null) root.right = r.right;
                    else root.right = r.left;
                }
                else{ // 2 children
                    Node curr = r;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    delete(root, pred.data);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else delete(root.right, target);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root = constructBFS(arr);
        preOrder(root);
        System.out.println();
        Node temp = new Node(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp, 20);
        preOrder(root);
    }
}
