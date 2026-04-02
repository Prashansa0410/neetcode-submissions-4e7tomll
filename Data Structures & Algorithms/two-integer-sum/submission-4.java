class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> diffMap = new HashMap<>();
       int[] index = new int[2];
       for(int i=0;i<nums.length;i++){
        int diff = target-nums[i];
        if(diffMap.containsKey(diff)){
            index[0]=diffMap.get(diff);
            index[1]= i;
        }
        diffMap.put(nums[i],i);
       }
       return index;
    }
    
}
