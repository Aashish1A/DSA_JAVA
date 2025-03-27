package Practice_Questions;

import java.util.Scanner;
import java.util.Stack;

public class removeBracketForBalance {

    public static int minBracketsToRemove(String str){
        Stack <Character> st = new Stack<>();
        int n = str.length();
        int unbalancedClose = 0;
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(ch=='(') {
                st.push(ch);
            }
            else if(ch==')'){
               if(!st.isEmpty()){
                st.pop();
               }else{
                unbalancedClose++;
               }
            }
        }

        int unbalancedOpen = st.size();
        return unbalancedOpen + unbalancedClose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
       
        int minRemovals = minBracketsToRemove(str);
        System.out.println("Minimum brackets to remove for balance: " + minRemovals);

        sc.close();
    }
}
