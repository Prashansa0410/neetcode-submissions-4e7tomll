class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> prevMap = new HashMap<>();
        int [] index = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = target-nums[i];
            if(prevMap.containsKey(diff)){
                index[1]=i;
                index[0]=prevMap.get(diff);
            }
            else
            prevMap.put(nums[i],i);
        }
        return index;
    }
}
