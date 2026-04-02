class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
               sum =sum+nums[j];
               maxSum= Math.max(maxSum,sum);
            }
            maxSum= Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
