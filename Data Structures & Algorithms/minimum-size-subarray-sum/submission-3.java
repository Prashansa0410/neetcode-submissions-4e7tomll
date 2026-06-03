class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Brute Force
        int minimum=Integer.MAX_VALUE;
        int length=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                    length=j-i+1;
                    minimum=Math.min(minimum,length);
                }
            }
        }
        return minimum==Integer.MAX_VALUE?0:minimum;
    }
}