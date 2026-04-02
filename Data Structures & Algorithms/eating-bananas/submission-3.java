class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int lowerBound = 1;
        int count=1;
        double min = Integer.MAX_VALUE;
        for(int pile:piles){
            max=Math.max(pile,max);
        }
        int upperBound = max;
        int ans=upperBound;

        int low = 1;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            double totalTime=0;
            for(int pile:piles){
                double time = Math.ceil((double)pile/mid);
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
