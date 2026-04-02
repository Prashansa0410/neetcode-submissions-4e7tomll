class Solution {
    int[][] dp;
     
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        dp = new int[n+1][m+1];
          for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return longestCS(text1,text2,n,m);

   
    }

    public int longestCS(String text1, String text2, int n, int m){

        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(text1.charAt(n-1)==text2.charAt(m-1)){
            return dp[n][m]=1+longestCS(text1,text2,n-1,m-1);
        }

        else {
            return dp[n][m]=Math.max(longestCS(text1,text2,n-1,m),longestCS(text1,text2,n,m-1));
        }
    }
 }
        


