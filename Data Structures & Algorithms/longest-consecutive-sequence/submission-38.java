class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;


    Set<Integer> set = new HashSet<>();
    int count=1;
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }

    for(int i=0;i<nums.length;i++){      
        if(!set.contains(nums[i]-1)){
             count=1;
            while(set.contains(count+nums[i])){
                count++;
            }            
        }
        max = Math.max(max,count);

    }
    return max;
    }


}
