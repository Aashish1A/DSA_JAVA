package Practice_Questions;

import java.util.Stack;

public class slidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k){
         int n = nums.length;
         int[] ans = new int[n-k+1];
         int z = 0;
         Stack<Integer> st = new Stack<>();
         int[] nge = new int[n];
         nge[n-1] = n;
         st.push(nge[n-1]);
         for(int i=n-2; i>=0; i--){
            while(st.size()>0 && nums[i]>=nums[st.peek()]) st.pop();
            if(st.size()==0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
         }
         int j = 0;
         for(int i=0; i<n-k+1; i++){
            if(j>=i+k) j = i;
            int max = nums[j];
            while(j<i+k){
                max = nums[j];
                j = nge[j];
            }
            ans[z] = max;
            z++;
          }
          return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(maxSlidingWindow(nums,k));;
    }
}
