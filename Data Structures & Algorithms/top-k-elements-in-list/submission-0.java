class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i =0;i<nums.length;i++)
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        List<Map.Entry<Integer,Integer>> al = new ArrayList<>(map.entrySet());
        al.sort((a,b)-> b.getValue() - a.getValue());
        int arr[] = new int[k];
        for(int i=0;i<k;i++)
          arr[i] = al.get(i).getKey();
        return arr;
    }
}
