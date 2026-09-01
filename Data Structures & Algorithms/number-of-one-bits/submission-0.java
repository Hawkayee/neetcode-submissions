class Solution {
    public int hammingWeight(int n) {
        return countBits(n);
        //return Integer.bitCount(n);

    
    }
    private int countBits(int n ){
        int res = 0;
        while(n != 0){
            n &= n- 1;
            res++;
        }
        return res;
    }
}
