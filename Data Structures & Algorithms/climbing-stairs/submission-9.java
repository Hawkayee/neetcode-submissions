class Solution {
    public int climbStairs(int n) {

        // Here we have the objective function of the problem 
        // We have to find the distinct way of the climb the staris 
        // We can go up 1 stairs or 2 stairs 
        int dp[] = new int[n+1];
        // Base cases
        //if(n < 2) return n;
        dp[0] = 1;
        dp[1] = 1;

        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
        }
        //return dp[n];

        return spaceOpti(n);
    }

    private int spaceOpti(int n){
        if(n <= 1) return n;

        int zerothStair = 1;
        int firstStair = 1;

        for(int i = 2;i<=n;i++){
            int ways = zerothStair + firstStair;
            zerothStair = firstStair;
            firstStair = ways;
        }
        return firstStair;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
        

}
