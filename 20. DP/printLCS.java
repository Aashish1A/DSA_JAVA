class Solution {
    public String lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++) dp[i][j] = -1;
        }

        // Tabulation
        for(int j=0; j<=m; j++) dp[0][j] = 0;
        for(int i=0; i<=n; i++) dp[i][0] = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        // Building answer string
        int len = dp[n][m];
        char[] ans = new char[len];
        int idx = len - 1;

        int i=n, j=m;
        while(i > 0 && j > 0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                ans[idx] = str1.charAt(i-1);
                idx--;
                i--; j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]) i--;
            else j--;
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "abcde";
        String str2 = "bdgek";
        String lcs = solution.lcs(str1, str2);
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}

