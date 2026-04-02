class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lowerbound=1;
        int max=0;
        for(int pile:piles){
            max=Math.max(max,pile);
        }

        int upperbound=max;
        int ans =upperbound;
        int low=1;
        int high=max;

        while(low<=high){
            double totalTime=0;
            int mid =(low+high)/2;
            for(int pile:piles){
                double time=Math.ceil((double)pile/mid);
                totalTime+=time;
            }

            if(totalTime<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

            
        }
        return (int)ans;

    }
}
