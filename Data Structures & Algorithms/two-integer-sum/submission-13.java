class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int number = target-nums[i];
            if(freqMap.containsKey(number)){
              result[0] = freqMap.get(number);
              result[1]=i;
            }
            freqMap.put(nums[i],i);
           
        }
        return result;

    }
}
