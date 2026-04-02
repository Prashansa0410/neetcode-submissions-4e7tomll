public class Solution {
    

     public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        // Calculate the total sum of the elements in nums
        for (int num : nums) {
            sum += num;
        }

        // If (sum + target) is odd or target > sum, it's impossible to partition
        if ((sum + target) % 2 != 0 || target > sum) {
            return 0;
        }

        // S1 is the target we need to find as the subset sum
        int S1 = (sum + target) / 2;

        // Initialize DP array: dp[i][j] represents the number of ways to get sum j using the first i elements
        int[][] dp = new int[nums.length + 1][S1 + 1];

        // Base case: There's 1 way to get sum 0 (by selecting no elements)
        dp[0][0] = 1;

        // Initialize the first row, dp[0][j] = 0 for all j > 0 (no way to get a positive sum with no elements)
        for (int i = 1; i <= S1; i++) {
            dp[0][i] = 0;
        }

        // Fill the DP table
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= S1; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // The result is the number of ways to achieve sum S1 using all the elements
        return dp[nums.length][S1];
    }
}