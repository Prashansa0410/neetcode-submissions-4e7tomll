class Solution {
    public int trap(int[] height) {
        // maxl, maxr
        // Ans===>min(mxl,maxr)-height[l]

        //Strforward solutin
      
        int maxl = 0, maxr = 0;
        int l = 0, r = height.length - 1;
        int area = 0;
        while (l < r) {
            if (height[l] <= height[r]) {
                maxl = Math.max(maxl, height[l]);
                area += maxl - height[l];
                l++;
            }

            else {
                maxr = Math.max(maxr, height[r]); 
                area += maxr - height[r];
                r--;
                
            }
        }
        return area;
    }
}
