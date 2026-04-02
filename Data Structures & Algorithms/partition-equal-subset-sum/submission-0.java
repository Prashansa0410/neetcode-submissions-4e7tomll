class Solution {
    public Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else{
            return subSetSum(nums,sum/2,nums.length);
        }
    }
        
        public Boolean subSetSum(int[] nums, int targetSum, int n){
            dp= new Boolean[n+1][targetSum+1];

            for(int i=0;i<=n;i++){
                dp[i][0]=true;
            }
            for(int j=1;j<=targetSum;j++)
            {
                dp[0][j]=false;
            }

            for(int i=1;i<n+1;i++){
                for(int j=1;j<targetSum+1;j++){
                    if(nums[i-1]<=j){
                        dp[i][j]= dp[i-1][j-nums[i-1]]|| dp[i-1][j];
                    }
                    else
                    dp[i][j]=dp[i-1][j];
                }
            }
           return dp[n][targetSum]; 
        }
        
    }

