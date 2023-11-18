public class MinimumCoins {
    //O(coins * target)
    public static int minCoins(int[] coins, int target) {
        // Create a table to store the minimum number of coins needed for each value up to the target
        int[] dp = new int[target + 1];

        // Initialize the table with a value larger than any possible solution
        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Iterate through each coin denomination
        for (int coin : coins) {
            // Update the table for each value up to the target
            for (int i = coin; i <= target; i++) {
                // If adding the current coin reduces the number of coins needed, update the table
                if (dp[i - coin] != Integer.MAX_VALUE && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                }
            }
        }

        // The final result is stored in dp[target]
        return dp[target] == Integer.MAX_VALUE ? -1 : dp[target];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int target = 11;

        int result = minCoins(coins, target);

        if (result == -1) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Minimum number of coins needed: " + result);
        }
    }
}
