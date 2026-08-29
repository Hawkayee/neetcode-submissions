class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean arr[] = new boolean[nums.length + 1];
        for(int num:nums){
            if(num >0 && num <= nums.length)
               arr[num] = true;
        }

        for(int i = 1;i<=nums.length;i++){
            if(!arr[i])
               return i;
        }
        return nums.length + 1;
    }
}