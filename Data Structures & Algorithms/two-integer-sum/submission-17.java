class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> freqMap =new HashMap<>();
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            int number = target-nums[i];
            if(freqMap.containsKey(number)){
                output[0]=freqMap.get(number);
                output[1]=i;
            }
            freqMap.put(nums[i],i);
        }
        return output;
    }
}
