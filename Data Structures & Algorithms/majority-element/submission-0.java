class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int currCandidate = 0;
       for(int num: nums){
            if(count ==0)
              currCandidate = num;
            
            if(currCandidate == num)
              count++;
            else 
              count--;
       } 

       return currCandidate;
    }
}