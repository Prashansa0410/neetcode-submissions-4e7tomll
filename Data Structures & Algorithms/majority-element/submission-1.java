class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int majority=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i])>maxcount){
                majority=nums[i];
                maxcount=freq.get(nums[i]);
            }

        }
        return majority;

        
    }
}