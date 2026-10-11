class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }
        int left=1;
        int right=max;
        int ans=0;

        while(left<=right){
            int mid = left+(right-left)/2;
            int hours=0;
            
            for(int i=0;i<piles.length;i++){
                hours+= Math.ceil((double)piles[i]/mid);
            }
                if(hours<=h){
                    ans=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            return ans;
        }
        
    }

