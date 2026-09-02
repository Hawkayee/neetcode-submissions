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
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);

    }
    private int climb(int n ,int dp[]){
        if(n <= 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = climb(n-1,dp) + climb(n-2,dp);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
        

}
