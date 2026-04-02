class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combination(nums,target,ans,res,0);
        return res;
    }
    public void combination(int[] nums,int target,List<Integer> ans, List<List<Integer>> res,int index){
        int n = nums.length;
         if(index==n || target<0){
            return;
         }

       if(target==0){
        res.add(new ArrayList<>(ans));
        return;
       }
        
        //1stchoice to include once 1st element
        ans.add(nums[index]);
        combination(nums,target-nums[index],ans,res,index);
        //Backtrack
        ans.remove(ans.size()-1);
        combination(nums,target,ans,res,index+1);
        
    }
}
