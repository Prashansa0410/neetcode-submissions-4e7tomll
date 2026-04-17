class Solution {
    public int maxProfit(int[] prices) {
      int min = Integer.MAX_VALUE;
      int max=0;
      int i=0,j=i+1;
      for( i=1;i<prices.length;i++){
        min = Math.min(min,prices[i-1]);
        max=Math.max(prices[i]-min,max);

      }
      return max;
    }
}
