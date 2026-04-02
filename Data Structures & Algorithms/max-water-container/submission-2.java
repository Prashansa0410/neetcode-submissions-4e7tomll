class Solution {
    public int maxArea(int[] heights) {
         int maxArea = 0;
         int i=0;
         int j=heights.length-1;
         int minArea = Integer.MAX_VALUE;
          while(i<j){
            int area = Math.min(heights[i],heights[j])*(j-i);
            maxArea=Math.max(area,maxArea);
            if(heights[i]<heights[j]){
                i++;
            }
                else
                j--;
            }
             return maxArea;
          }
         
    }

