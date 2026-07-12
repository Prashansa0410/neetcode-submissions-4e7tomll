class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
         dp = new int[text1.length()+1][text2.length()+1];
        for (int[] row : dp) {
        Arrays.fill(row, -1);
         }
        return LCS(text1,text2,0,0);        
    }

    public int LCS(String text1,String text2,int i,int j){
       


        //base condition
        if(text1.length()==i || text2.length()==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        //if character match found
        if(text1.charAt(i)==text2.charAt(j)){
             dp[i][j]=1+LCS(text1,text2,i+1,j+1);
             return dp[i][j];
        }
        dp[i][j]= Math.max(LCS(text1,text2,i+1,j),LCS(text1,text2,i,j+1));
        return dp[i][j];

    }
}
