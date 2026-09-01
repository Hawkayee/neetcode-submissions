class Solution {
    public int[] dailyTemperatures(int[] tempratures) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[tempratures.length];

        // We are storing the indices Here  

        for(int i =0;i< ans.length;i++){
            while(!st.isEmpty() && tempratures[i] > tempratures[st.peek()]){
                int preveIndex = st.pop();
                ans[preveIndex] = i - preveIndex;
            }
            st.push(i);
        }
        return ans;
    }
}
