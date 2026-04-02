class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] mul = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                prod = prod*nums[j];
                }
            }
            mul[i]=prod;
        }
        return mul;
    }
}  
