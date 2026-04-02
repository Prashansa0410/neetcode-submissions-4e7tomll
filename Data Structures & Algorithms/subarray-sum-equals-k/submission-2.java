class Solution {
    public int subarraySum(int[] nums, int k) {
        int current_sum=0;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int total_count=0;
        prefixSum.put(0,1);

        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            int sum=current_sum-k;
            if(prefixSum.containsKey(sum)){
                total_count+=prefixSum.get(sum);
            }
             prefixSum.put(current_sum,
             prefixSum.getOrDefault(current_sum, 0) + 1);        }
        return total_count;

    }
}