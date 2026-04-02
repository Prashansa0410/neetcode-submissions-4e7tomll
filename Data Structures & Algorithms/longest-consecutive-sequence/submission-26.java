class Solution {
    public int longestConsecutive(int[] nums) {
      int length=0;
      int result=0;
      HashSet<Integer> set = new HashSet<>();
      if(nums.length==1){
        length=1;
        return length;
      }
     
      for(int num:nums){
        set.add(num);
      }
     
     for(int i=0;i<nums.length;i++){
        length=1;
        if(!set.contains(nums[i]-1)){
           while(set.contains(nums[i]+length))
              length++;
        }
        result =Math.max(result,length);
      }
      return result;
    }
             
 }
      
