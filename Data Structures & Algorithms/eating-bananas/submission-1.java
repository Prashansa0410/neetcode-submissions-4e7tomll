class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int x : piles){
            if(x>max)
                max = x;
        }

        for(int i=1;i<=max;i++){
            Long hours = 0L;
            for (int j=0; j<piles.length; ++j){
                int x = piles[j]/i;
                hours += (piles[j]%i==0) ? x : 1+x;
            }

            if(hours <=h)
                return i;
        }
        return -1;
    }
}
