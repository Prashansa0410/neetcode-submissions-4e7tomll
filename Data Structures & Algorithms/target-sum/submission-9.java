public class Solution {

    public static int findTargetSumWays(int[] nums, int target) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // If the total sum and target don't satisfy the condition, return 0
        if ((totalSum + target) % 2 != 0 || totalSum < target) {
            return 0;
        }

        // Calculate the new target (S1) that we need to find subsets for
        int newTarget = (totalSum + target) / 2;

        // Initialize a DP array to store the number of ways to get each sum
        int[] dp = new int[newTarget + 1];
        dp[0] = 1;  // There's one way to make 0 sum (by selecting no elements)

        // Process each number in the array
        for (int num : nums) {
            // Update the dp array from right to left (to prevent reuse of the same element)
            for (int i = newTarget; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        // Return the number of ways to achieve the new target
        return dp[newTarget];
    }
}
