class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        subset(nums,ans,res,0);
       return res;        
    }

    public void subset(int[] nums,List<Integer> ans,List<List<Integer>> res,int index){

        if(index==nums.length){
            res.add(new ArrayList<>(ans));   
            return;     
        }
        ans.add(nums[index]);
        subset(nums,ans,res,index+1);
        ans.remove(ans.size()-1);
        subset(nums,ans,res,index+1);

        
    }
}
