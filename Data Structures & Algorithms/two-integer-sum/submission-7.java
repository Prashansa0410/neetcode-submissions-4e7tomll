class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> freqMap = new HashMap<>();
      int[] value=new int[2];
      for(int i=0;i<nums.length;i++){
        int number = target-nums[i];
        if(freqMap.containsKey(number)){
          value[0]=freqMap.get(number);
          value[1]=i;          
        }
        freqMap.put(nums[i],i);
      }
      return value;
    }
    
}
