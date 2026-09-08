class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int dp[][] = new int[row][col];
        for(int j =0; j < col;j++){
            if(obstacleGrid[0][j] == 1) break;
            else 
              dp[0][j] = 1;

        }

        for(int i = 0; i < row; i++){
            if(obstacleGrid[i][0] == 1) break;
            else
              dp[i][0] = 1;
        }
        return solve(row-1,col-1,dp,obstacleGrid);
    }

    private int solve(int m, int n, int dp[][],int obstacleGrid[][]){
        if(m == 0 || n == 0) return dp[m][n];
        
        if(obstacleGrid[m][n] == 1) return 0;

        if(dp[m][n] != 0) return dp[m][n];

        return dp[m][n] = solve(m-1,n,dp,obstacleGrid)+ solve(m,n-1,dp,obstacleGrid);
    }
}