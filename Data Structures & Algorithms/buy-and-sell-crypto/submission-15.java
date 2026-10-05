class Solution {
    public int maxProfit(int[] prices) {
        //Track min value so far
        int minVal=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            minVal=Math.min(minVal,prices[i]);
            maxProfit =  Math.max(maxProfit,prices[i]-       minVal);          

        }
        return maxProfit;
        
    }
}
