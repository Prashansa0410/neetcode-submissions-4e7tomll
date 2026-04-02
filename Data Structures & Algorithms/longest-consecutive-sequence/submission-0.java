class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);

        int longestStreak=1,currentStreak=1,i=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    currentStreak++;
                }
                else{
                    longestStreak= Math.max(longestStreak,currentStreak);
                    currentStreak=1;
                }
            }
        }
        return Math.max(longestStreak,currentStreak) ;
    }
}
