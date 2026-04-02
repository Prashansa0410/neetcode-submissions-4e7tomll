class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }

    public int binarySearch(int [] nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<=target){
                start =mid +1;
            }
            else
            end = mid-1;
        }
        return -1;
    }
}
