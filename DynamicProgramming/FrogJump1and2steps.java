package DynamicProgramming;

import java.util.Arrays;

public class FrogJump1and2steps {

    private static int f(int ind, int[] heights, int[] dp) {
        if (ind == 0)
            return 0;

        if (dp[ind] != -1)
            return dp[ind];

        int left = f(ind - 1, heights, dp) + Math.abs(heights[ind] - heights[ind - 1]);
        ;
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = f(ind - 2, heights, dp) + Math.abs(heights[ind] - heights[ind - 2]);
        }
        return Math.min(left, right);
    }

    public static int frogjumpmemo(int n, int[] arr, int[] dp) {
        return f(n - 1, arr, dp);
    }

    public static int frogjumptabulation(int n, int[] arr) {
        int[] dp = new int[n];
        Arrays.fill(dp, 0);
        int prev = 0;
        int prev1 = 0;
        for (int i = 1; i < n; i++) {
            int fs = prev + Math.abs(arr[i] - arr[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1) {
                ss = prev1 + Math.abs(arr[i] - arr[i - 2]);
            }

            int curi = Math.min(fs, ss);
            prev1 = prev;
            prev = curi;
        }

        return prev;
    }

    public static void main(String[] args) {
        int[] heights = { 30, 10, 60, 10, 60, 50 };
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Min Energy Required : " + frogjumpmemo(n, heights, dp));
        System.out.println("Min Energy Required : " + frogjumptabulation(n, heights));
    }
}
