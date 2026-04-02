class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int longestStreak=0;
        int currentStreak=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                if(nums[i]==nums[i-1]+1)
                {
                    currentStreak++;
                }
                else{
                    longestStreak = Math.max(currentStreak,longestStreak);
                    currentStreak=1;
                }
            }
        }
        return longestStreak = Math.max(currentStreak,longestStreak);

    }
}
