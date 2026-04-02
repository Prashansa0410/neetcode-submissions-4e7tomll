class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] index = new int[2];
      for(int i=0;i<nums.length;i++){
        int number = target-nums[i];
           if(map.containsKey(number)){
            index[0]=map.get(number);
            index[1]= i;
           }
           map.put(nums[i],i);
      }
      return index;
    }
}
