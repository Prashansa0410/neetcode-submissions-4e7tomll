class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];

        int[] frontProduct = new int[nums.length];
        int[] backProduct = new int[nums.length];

        for (int i = 0; i<nums.length; ++i){
            frontProduct[i] = (i==0) ? nums[i] : frontProduct[i-1]*nums[i];
        }

        for (int i = nums.length-1; i>=0; --i){
            backProduct[i] = (i==nums.length-1) ? nums[i] : backProduct[i+1]*nums[i];
        }

        for(int i = 0; i<nums.length; ++i){
            if (i==0)
                product[i] = backProduct[i+1];
            else if(i==nums.length-1)
                product[i] = frontProduct[i-1];
            else
                product[i] = frontProduct[i-1] * backProduct[i+1];
        }

        return product;
    }
}
    
    

    
 
