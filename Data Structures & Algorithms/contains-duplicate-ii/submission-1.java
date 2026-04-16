class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j=0;
        int i=0;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        while(j<n){
            if(j-i>k){
                set.remove(nums[i]);
                i++;
            }
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
            
            j++;
            
        }
        return false;
    }
}