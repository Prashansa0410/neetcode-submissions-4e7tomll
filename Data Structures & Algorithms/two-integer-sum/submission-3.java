class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> freqmap = new HashMap<>();
       int[] num = new int[2];
       for(int i=0;i<nums.length;i++){
        int diff = target-nums[i];
        if(freqmap.containsKey(diff)){
            num[0]=freqmap.get(diff);
            num[1]=i;
        }
        freqmap.put(nums[i],freqmap.getOrDefault(nums[i],i));
       }

       return num;

    }
    
}
