class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
              sum=sum+nums[j];
              if(sum>=target){
                length=Math.min(j-i+1,length);
                count++;
              }
            }
        }
        if(count==0){
            length=0;
        }
        return length;
    }
}