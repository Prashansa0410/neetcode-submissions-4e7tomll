class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        int maxLength=0;
        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
           if(!set.contains(num-1)){
            count=1;
           while(set.contains(num+count)){
            count++;
           }
           maxLength=Math.max(count,maxLength);
           }
        }
        return maxLength;
    }
}
