class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] index = new int[2];
       Map<Integer,Integer> indexMap = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int diff = target-nums[i];
        if(indexMap.containsKey(diff)){
            index[0]= indexMap.get(diff);
            index[1]= i;
        }
        indexMap.put(nums[i],i);
       }
       return index;
    }
    
}
