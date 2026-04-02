class Solution {
    public int maxArea(int[] heights) {
         int maxArea = Integer.MIN_VALUE;
         int i=0;
         int j = heights.length-1;

         while(i<j){
            int area = (Math.min(heights[i],heights[j]))*(j-i);
            maxArea = Math.max(area,maxArea);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
         }
         return maxArea;
          }
         
    }

