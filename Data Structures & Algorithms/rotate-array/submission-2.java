class Solution {
    public void rotate(int[] nums, int k) {
        //Rearrangement problem --> Valid elements to left and Invalid to right
     int[] nums1 =new int[nums.length];
     int n = nums.length;

     for(int i=0;i<n;i++){
        nums1[(i+k)%n]=nums[i];
     } 
     for(int i=0;i<n;i++){
        nums[i]=nums1[i];
     }

  
    }
}