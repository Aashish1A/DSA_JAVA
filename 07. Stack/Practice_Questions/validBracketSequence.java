package Practice_Questions;

import java.util.Scanner;
import java.util.Stack;

public class validBracketSequence {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.size()==0) return false;
                else{
                    if(!st.isEmpty()){
                        if(ch==')' && st.peek()=='(' || ch=='}' && st.peek()=='{' || ch==']' && st.peek()=='[') st.pop();
                        else return false;
                    }
                }
            }
        }
        if(st.size()>0) return false;
        else return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
