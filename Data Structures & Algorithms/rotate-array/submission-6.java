class Solution {
    public void rotate(int[] nums, int k) {
        //Rearrangement problem --> Valid elements to left and Invalid to right
     k=k%nums.length;
     int l=0,r=nums.length-1;
     while(l<r){
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;r--;
     }
      l=0;r=k-1;
     while(l<r){
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;r--;
     }
      l=k;r=nums.length-1;
     while(l<r){
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;r--;
     }

  
    }
}