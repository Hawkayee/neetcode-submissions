class Solution {
    public int climbStairs(int n) {
        // int firstNum = 1;
        // int secondNum = 2;

        // for(int i =3;i<=n;i++){
        //     int current = firstNum + secondNum;
        //     firstNum = secondNum;
        //     secondNum = current;
        // }

        // return n <= 2 ? n : secondNum;
        //int dp[] = new int[n+1];
       // Arrays.fill(dp,-1);
        //return climb(n,dp);

        return solve(n);

    }
    private int climb(int n ,int dp[]){
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = climb(n-1,dp) + climb(n-2,dp);
    }
    private int solve(int n ){
        int dp[] = new int[n+1];
        dp[0] = 1;
        if(n >=1)
          dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2]; 
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
        

}
