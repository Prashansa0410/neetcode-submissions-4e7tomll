class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Binary search in answer
        int low=1, max1=0,ans=0;
        for(int pile:piles){
             max1=Math.max(pile,max1);
        }
        int high=max1;
        

        while(low<=high){
            int mid = low+(high-low)/2;
            double totaltime=0;
            for(int pile:piles){
                totaltime+=Math.ceil((double)pile/mid);
            }
            if(totaltime<=h){
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
