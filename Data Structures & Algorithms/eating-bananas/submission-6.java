class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int max=0;
        int ans=0;
        for(int pile:piles){
           max= Math.max(pile,max);
        }
        int high=max;

        while(low<=high){
            int mid=low+(high-low)/2;
            int totalTime=0;
            for(int pile:piles){
                totalTime+=Math.ceil((double)pile/mid);
            }

            if(totalTime<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;    
    }
}
