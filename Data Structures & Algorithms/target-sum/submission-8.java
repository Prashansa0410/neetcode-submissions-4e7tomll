class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // If the target is greater than sum or (sum + target) is odd, return 0
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }

        // S1 is the subset sum we need to find
        int S1 = (sum + target) / 2;

        // dp[i] will be the number of ways to form sum i using the numbers in nums
        int[] dp = new int[S1 + 1];
        dp[0] = 1; // There's one way to make sum 0: choose no elements

        // Iterate through each number in nums and update the dp array
        for (int num : nums) {
            // Traverse backwards to avoid using the same number multiple times
            for (int j = S1; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        // The number of ways to achieve the sum S1 will be stored in dp[S1]
        return dp[S1];
    }
}
