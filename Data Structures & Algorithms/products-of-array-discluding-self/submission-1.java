class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total=1,countofZero=0;
        int output[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            total = total*nums[i];
            }
            else
            countofZero++;
        }
        if(countofZero>1){
            return new int[nums.length];
        }
         
        for(int j=0;j<nums.length;j++){
            if(countofZero>0){
                    output[j]= (nums[j]==0)?total:0;
            }
            else
            output[j]= total/nums[j];
            }
            return output; 
        }
            
    }

    
 
