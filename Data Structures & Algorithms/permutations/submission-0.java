class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(nums,0,ans);
        return ans;        
    }

    public void permutations(int[] nums,int index,List<List<Integer>> ans){
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();
        if(index==n){
        for (int num : nums) {
        temp.add(num);
         }
        ans.add(temp);
        return;
        }

        for(int i=index;i<n;i++){
            int j= nums[i];
            nums[i]=nums[index];
            nums[index]=j;
            permutations(nums,index+1,ans);
            //Backtracking
             j= nums[i];
            nums[i]=nums[index];
            nums[index]=j;

        }

    }

}
