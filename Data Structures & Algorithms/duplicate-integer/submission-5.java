public class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            for(int j=1+i;j<nums.length;j++){
            if (nums[j] == nums[i]) {
               return true;
            }
            }
        }
        return false;
        }
    
}


