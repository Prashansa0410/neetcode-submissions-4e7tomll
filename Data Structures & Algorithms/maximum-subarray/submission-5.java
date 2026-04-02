class Solution {

    //Kandane's algorithm - The current sum if it becomes negative will reduce the 
    //sum, so reset and start the current sum from current number-that is start new subarray
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=0;
        for(int num:nums){
            if(currSum<0){
                currSum=0;
            }     
            currSum+=num;  
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
