class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxl = new int[n];
        int[] maxr = new int[n];
        int[] min = new int[n];
        int[] water = new int[n];
        int area=0;
        maxl[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxl[i]=Math.max(height[i],maxl[i-1]);
        }

        maxr[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxr[i]=Math.max(height[i],maxr[i+1]);
        }

        for(int i=0;i<n;i++){
            min[i]=Math.min(maxr[i],maxl[i]);
        }

        for(int i=0;i<n;i++){
            water[i]=min[i]-height[i];
            if(water[i]>0){
                area=area+water[i];
            }
        }
        return area;
    }
}
