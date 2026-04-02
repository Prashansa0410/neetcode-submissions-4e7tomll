class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] output=new int[nums.length];
      int pre=1;
      output[0]=pre;
      for(int i=1;i<nums.length;i++){
           pre*=nums[i-1];
            output[i]=pre;
           }
          
    int post=1;
    
      for(int i=nums.length-1;i>=0;i--){
       output[i] *= post;
       post *= nums[i];
      }

      return output;
    }
}

