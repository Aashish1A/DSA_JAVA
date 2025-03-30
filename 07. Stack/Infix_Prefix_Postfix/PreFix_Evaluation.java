package Infix_Prefix_Postfix;

import java.util.Stack;

public class PreFix_Evaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack <Integer> val = new Stack<>();
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0' -> 48, '9' -> 57
            if(ascii>=48 && ascii<=57)
                val.push(ascii-48);
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
