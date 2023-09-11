package array;

public class CoinChange {
    public static long count(int[] coins, int N, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,3};
        System.out.println(count(coins, coins.length, 4));
    }
}
