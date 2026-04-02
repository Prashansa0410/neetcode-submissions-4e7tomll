class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int res=0;

        for(int i=1;i<n-1;i++){
            int leftMax=0,rightMax=0;
            for(int l=0;l<i;l++){
                 leftMax = Math.max(leftMax,height[l]);
            }

             for(int r=i+1;r<n;r++){
                 rightMax = Math.max(rightMax,height[r]);
            }

            int waterTrapped = Math.min(leftMax,rightMax)-height[i];

            if(waterTrapped>0){
                res=res+waterTrapped;
            }
        }
        return res;

        }

}
