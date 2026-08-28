class Solution {
    public int maxArea(int[] heights) {
        int maximum =0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){
            int len = Math.min(heights[left],heights[right]);
            int wide = right - left;

            maximum = Math.max(maximum, len * wide);

            if(heights[left] < heights[right]) left++;
            else right--;
        }

        return maximum;
    }
}
