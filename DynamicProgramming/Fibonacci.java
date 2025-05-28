package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    // using Memoisation ---
    public static int fibonacciDPusingMemoization(int n, int[] dp) {
        if (n <= 1)
            return n;

        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fibonacciDPusingMemoization(n - 1, dp) + fibonacciDPusingMemoization(n - 2, dp);
    }

    // using Tabulation----
    public static int fibonacciDPusingTabulation(int n) {
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int current = prev + prev2;
            prev2 = prev;
            prev = current;
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Easy Way !!
        // for (int i = 0; i <= n; i++) {
        // dp[i] = -1;
        // }

        System.out.println("Fibonacci of " + n + " is: " + fibonacciDPusingMemoization(n, dp));
        System.out.println("Fibonacci of " + n + " is: " + fibonacciDPusingTabulation(n));

    }
}
