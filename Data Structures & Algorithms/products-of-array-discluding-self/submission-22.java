class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] result = new int[nums.length];
        int prod=1;
        pre[0]=1;
        int n=nums.length-1;
        post[n]=1;
        
        for(int i=1;i<nums.length;i++){
            prod=prod*nums[i-1];
            pre[i]=prod;
        }
        prod=1;

        for(int j=n-1;j>=0;j--){
            prod=prod*nums[j+1];
            post[j]=prod;
            
        }
        
       

        for(int k=0;k<nums.length;k++){
            result[k]=pre[k]*post[k];
        }
        return result;
    }
}  
