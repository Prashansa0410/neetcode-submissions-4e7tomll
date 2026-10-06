class Solution {
    public int trap(int[] height) {
        // track max from left and right pointers
        // if we get some pointer greater than previous max, increment
        // find min among them
        // then do subtract minimum-current index
        // if value is negative discard
        // else add the values

        int left = 0;
        int right = height.length - 1;
        int maxl = 0;
        int maxr = 0;
        int area = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                maxl = Math.max(maxl, height[left]);
                area += maxl - height[left];
                left++;
                
            } else {
                maxr = Math.max(maxr, height[right]);
                area += maxr - height[right];
                right--;
            }
            
        }
        return area;
    }
}
