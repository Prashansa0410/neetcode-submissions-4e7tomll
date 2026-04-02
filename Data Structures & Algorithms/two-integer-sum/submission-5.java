class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       int[] num = new int[2];
       for(int i=0;i<nums.length;i++){
        int diff = target-nums[i];
        if(map.containsKey(diff)){
            num[0]=map.get(diff);
            num[1]=i;
        }
        map.put(nums[i],i);
       }
       return num;
    }
    
}
