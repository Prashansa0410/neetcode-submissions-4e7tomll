class Solution {
    public int findMin(int[] nums) {
        return binarySearch(nums,0,nums.length-1);
    }
    public int binarySearch(int[] nums, int start, int end){
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start= mid+1;
            }
            else
            end=mid;
        }
        return nums[start];
    }
    
}
