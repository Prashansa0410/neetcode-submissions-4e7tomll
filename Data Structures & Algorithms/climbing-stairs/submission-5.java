class Solution {
   int[] dp = new int[31];
    public int climbStairs(int n) {
       if(n==1 || n==2){
        return n;
       }
       if(dp[n]!=0){
        return dp[n];
       }
      return dp[n]=climbStairs(n-2)+climbStairs(n-1);
        
        
    }
    
}

