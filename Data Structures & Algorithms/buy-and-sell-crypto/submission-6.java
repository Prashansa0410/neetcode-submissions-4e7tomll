class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = Integer.MIN_VALUE;
       int minPrice =Integer.MAX_VALUE;
       for(int i=1;i<prices.length;i++){
        minPrice = Math.min(minPrice,prices[i-1]);
        maxProfit = Math.max(maxProfit,prices[i]-minPrice);
       }
       if(maxProfit<=0){
        return 0;
       }
       return maxProfit;
    }
         
}
       
    
        
    

