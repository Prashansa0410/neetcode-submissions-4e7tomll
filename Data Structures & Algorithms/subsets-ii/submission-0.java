class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums,ans,res,0);
        return res;
    }

    public void subsets(int[] nums, List<Integer> ans,List<List<Integer>> res,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        //inclusion
        ans.add(nums[i]);
        subsets(nums,ans,res,i+1);
        ans.remove(ans.size()-1);

        //exlusion
        int index=i+1;
        while(index<nums.length && nums[index]==nums[index-1]){
            index++;
        }
        subsets(nums,ans,res,index);
    }
}
