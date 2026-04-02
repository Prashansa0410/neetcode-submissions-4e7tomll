class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] output=new int[nums.length];
      int pre=1;
      output[0]=pre;
      for(int i=0;i<nums.length;i++){
           pre=pre*nums[i];
           if(i!=nums.length-1){
           output[i+1]=pre;
           }
      }

      
    int post=1;
    output[nums.length-1]=post*output[nums.length-1];
      for(int i=nums.length-1;i>0;i--){
           post=post*nums[i];
           System.out.println("post::"+post);
           output[i-1]=post*output[i-1];
      }

      for(int i=nums.length-1;i>0;i--){
        System.out.println(output[i]);
      }

      return output;
    }
}  
