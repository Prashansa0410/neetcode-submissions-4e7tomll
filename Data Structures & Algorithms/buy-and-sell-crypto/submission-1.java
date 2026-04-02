class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; //to track of profit
        int minPrice=Integer.MAX_VALUE;

        for(int i=1;i<prices.length;i++){
            minPrice=Math.min(prices[i-1],minPrice);
            profit =Math.max(prices[i]-minPrice,profit);
        }
        return profit;
  
    }
         
}
       
    
        
    

