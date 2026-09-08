class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int dp[][] = new int[row][col];
        dp[0][0] = grid[0][0];

        for(int i =1; i < col; i++)
          dp[0][i] = grid[0][i] + dp[0][i-1];

        for(int j =1; j < row; j++)
          dp[j][0] = grid[j][0] + dp[j-1][0];
        
        return solve(row -1, col -1, dp, grid);
    }

    private int solve(int m, int n ,int dp[][], int arr[][]){
        //if(m == 0 || n == 0) return 1;
        if(dp[m][n] != 0) return dp[m][n];
        return dp[m][n] = Math.min(solve(m-1,n,dp,arr) , solve(m,n-1,dp,arr)) + arr[m][n];
    }
}