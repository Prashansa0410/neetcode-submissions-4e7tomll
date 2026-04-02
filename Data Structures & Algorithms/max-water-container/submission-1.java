class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j =heights.length-1;
        
        int maxArea=  Integer.MIN_VALUE;
        while(i<j){
            int area= Math.min(heights[j],heights[i])*(j-i);
            maxArea = Math.max(area,maxArea);
            if(heights[i]<heights[j]){
                i++;
            }
            else
            j--;

        }
        return maxArea;
    }
}
