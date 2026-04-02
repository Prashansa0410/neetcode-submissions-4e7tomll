class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            int number =target-nums[i];
            if(freq.containsKey(number)){
                index[0]=freq.get(number);
                index[1]=i;
            }
            freq.put(nums[i],i);
        }
        return index;
    }
}
