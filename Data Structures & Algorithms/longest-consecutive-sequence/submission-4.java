class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longestStreak=0,currentStreak=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    System.out.println("streak:: with i iteration"+i+" "+currentStreak);
                    currentStreak++;
                }
                else{
                    longestStreak=Math.max(currentStreak,longestStreak);
                    currentStreak=1;
                }
            }
        }
       return Math.max(currentStreak,longestStreak);
}
}
