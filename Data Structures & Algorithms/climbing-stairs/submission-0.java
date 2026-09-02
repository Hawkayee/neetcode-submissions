class Solution {
    public int climbStairs(int n) {
        int firstNum = 1;
        int secondNum = 2;

        for(int i =3;i<=n;i++){
            int current = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = current;
        }

        return n <= 2 ? n : secondNum;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
        

}
