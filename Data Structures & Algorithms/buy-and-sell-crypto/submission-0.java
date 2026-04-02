class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; //to track of profit
        int j=0,i=0;
        int diff=0;
        //diffrence is maximum, it happens only if j is max and i is min
        for(i=0;i<prices.length;i++){
            for(j=i+1;j<prices.length;j++){
                diff=prices[j]-prices[i];
                profit=Math.max(profit,diff);
            }
        }
        return profit;
    }
        
    }

