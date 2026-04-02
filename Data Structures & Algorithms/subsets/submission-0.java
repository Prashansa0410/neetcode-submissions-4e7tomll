class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        subset(nums,ans,res,0);
        return res;
        
    }

    public void subset(int[] nums, List<Integer> subset, List<List<Integer>> ans, int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        //include

        subset.add(nums[i]);
        subset(nums,subset,ans,i+1);
        subset.remove(subset.size() - 1);
        subset(nums,subset,ans,i+1);
    }
}
