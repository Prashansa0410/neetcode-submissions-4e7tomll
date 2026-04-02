class Solution {
    int dp[][];
     
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        dp=new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return longestCSubsequence(text1,text2,m,n);
    }

    public int longestCSubsequence(String text1, String text2, int m , int n){
       if(m==0||n==0){
            return 0;
        }
        
        if(dp[m][n]!=-1){
            return dp[m][n];
         }
                    
        if(text1.charAt(m-1)==text2.charAt(n-1))
          return dp[m][n]=1+longestCSubsequence(text1,text2,m-1,n-1);
        
        else
            return dp[m][n]=Math.max(longestCSubsequence(text1,text2,m-1,n),longestCSubsequence(text1,text2,m,n-1));
            
            }     
            
        }
        


