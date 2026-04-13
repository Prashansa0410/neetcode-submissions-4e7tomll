class Solution {
    public int removeDuplicates(int[] nums) {
        int fast=0,slow=0;
        for(fast=1;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}