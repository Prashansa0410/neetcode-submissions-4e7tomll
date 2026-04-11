class Solution {
    public int findMin(int[] nums) {
        //Brute force
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            min = Math.min(min,num);

        }
        return min;
    }
}
