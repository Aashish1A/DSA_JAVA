package Practice_Questions;

import java.util.Stack;

public class largestRectangleArea {

    public int largestRectangle(int[] heights){
        int n = heights.length;
        Stack <Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        
        //Calculating nse
        st.push(n-1); //index
        nse[n-1] = n;
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 || heights[st.peek()]>= heights[i]){
                st.pop();
            }
            if(st.size()==0){
                nse[i] = n;
            }else{
                nse[i] = st.peek();
            }
            st.push(i);
        }

        //Empty stack
        while(st.size()>0) st.pop();

        //Calculating pse
        st.push(0);
        pse[0] = -1;
        for(int i=1; i<=n-1; i++){
            while(st.size()>0 || heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                pse[i] = -1;
            }else{
                pse[i] = st.peek();
            }
            st.push(i);
        }

        //Maximum area of rectangle
        int max = -1;
        for(int i=1; i<n; i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            max = Math.max(max,area);
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}
