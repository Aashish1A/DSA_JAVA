package Practice_Questions;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else {
                if (st.size() == 0)
                    return false;
                else if (ch == ')') {
                    if (!st.isEmpty()) {
                        st.pop();
                    }
                }
            }
        }
        if (st.size() > 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));

        sc.close();
    }
}
