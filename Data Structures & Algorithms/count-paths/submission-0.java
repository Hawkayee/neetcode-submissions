class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return solve(m- 1, n - 1,dp);
    }
    private int solve(int m, int n, int dp[][]){
        if(m==0 || n == 0) return 1;
        if(dp[m][n] != 0)
          return dp[m][n];

        return dp[m][n] = solve(m-1,n,dp) + solve(m,n-1,dp);
    }
}
