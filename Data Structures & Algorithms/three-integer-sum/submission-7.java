class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int target = -nums[i];
            int j = i+1,k=nums.length-1;
            while(j<k){
                
                if(nums[k]+nums[j]==target){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
            }
            else if(nums[j]+nums[k]>target){
                k--;
            }
            else{
                j++;
            }
            }
            
        }
        return new ArrayList<>(set);
    }
}
