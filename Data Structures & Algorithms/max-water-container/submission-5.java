class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                int length= Math.min(heights[i],heights[j]);
                int breadth = j-i;
                area = Math.max(length*breadth,area);
            }

        }
        return area;
    }
}
