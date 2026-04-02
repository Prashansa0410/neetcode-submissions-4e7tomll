class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
        int length=2*n;
        int[] output = new int[length];
        for(int i=0;i<n;i++){
            output[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            output[i+n]=output[i];
        }
        return output;
    }
}