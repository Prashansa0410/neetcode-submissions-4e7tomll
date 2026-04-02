class Solution {
    
    
  
    public int climbStairs(int n) {
        int dp[] = new int[31];
        if(dp[n]!=0){
            return dp[n];
        }
        if(n<=2){
            return n;
        }
         return dp[n]= climbStairs(n-1)+climbStairs(n-2);

        
    }
    
}

