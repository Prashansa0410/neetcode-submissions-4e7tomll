class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        
        for(int i=0;i<nums.length;i++){
            int target=-nums[i];
            int j=i+1,k=nums.length-1;
            while(j<k){
                if(target==nums[j]+nums[k]){
                    List<Integer> triplets=Arrays.asList(nums[i],nums[j],nums[k]);
                    set.add(triplets);
                    j++;k--;
                }
                else if(target>nums[j]+nums[k]){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
