class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> set  = new HashSet<>();
       Arrays.sort(nums);
       int i=0;
       for(i=0;i<nums.length-2;i++){
        int target = -nums[i];
        if(i>0 && nums[i-1]==nums[i]){
            continue;
        }
        int j= i+1;
        int k=nums.length-1;
        while(j<k){
            if(nums[j]+nums[k]==target){
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
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
