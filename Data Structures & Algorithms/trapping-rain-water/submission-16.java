class Solution {
    public int trap(int[] height) {
        int left=0;
        int area=0;
        int right=height.length-1;
        int maxl= 0;
        int maxr= 0;

        while(left<=right){
            if(height[left]<=height[right]){
                maxl = Math.max(maxl,height[left]);
                area+=maxl-height[left];
                left++;
            }
            else {
                maxr =Math.max(maxr,height[right]);
                area+=maxr-height[right];
                right--;
            }
            
        }
        return area;
    }
}
