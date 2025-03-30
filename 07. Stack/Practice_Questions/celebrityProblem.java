package Practice_Questions;

import java.util.Stack;

public class celebrityProblem {

    // koi bhi insaan celebrity tab hai jab sab usko jante ho and wo kisi ko nhi janta ho
    // agar i j ko janta hai toh 0 and agar nhi janta hai toh 1

    int celebrity(int M[][], int n){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size()==1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(M[v1][v2]==0) st.push(v1); // shayad v1 celeb ho, v2 toh celeb nhi hai
            else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1;
        int potential  = st.pop();
        for(int j=0; j<n; j++){
            if(M[potential][j]==1) return -1; // agar potential ush column me kisi ko janta hai tab toh wo celebrity nhi hai
        }
        for(int i=0; i<n; i++){
            if(i==potential) continue;
            if(M[i][potential]==0) return -1; // agar koi bhi insaan potential ko nhi janta hai tb toh woh celebrity nhi hai
        }
        return potential;
    }
    public static void main(String[] args) {
        
    }
}
