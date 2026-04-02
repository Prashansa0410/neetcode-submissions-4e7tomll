class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] output = new int[2];
        
        for(int i=0 ; i<nums.length;i++){
            int number = target-nums[i];
            if(map.containsKey(number)){
                output[0]=map.get(number);
                output[1]=i;
            }
            map.put(nums[i],i);
        }
        return output;

    }
}
