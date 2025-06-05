package DynamicProgramming;

import java.util.Arrays;
import java.util.Random;

public class UniquePaths {

    // recursion
    // public static int uniquepath(int i, int j) {
    // if (i == 0 && j == 0) {
    // return 1;
    // }
    // if (i < 0 || j < 0) {
    // return 0;
    // }
    // int up = uniquepath(i - 1, j);
    // int left = uniquepath(i, j - 1);
    // return up + left;
    // }

    // Tabultion

    public static int uniquePaths(int m, int n) {
        int[] prev = new int[n];
        Arrays.fill(prev, 1);

        for (int i = 1; i < m; i++) {
            int[] curr = new int[n];
            curr[0] = 1;
            for (int j = 1; j < n; j++) {

                curr[j] = prev[j] + curr[j - 1];

            }
            prev = curr;
        }
        return prev[n - 1];
    }

    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int[][] arr = new int[row][col];

        Random random = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = random.nextInt(10) + 1; // Generates numbers from 1 to 10
            }
        }

        System.out.println("Generated points array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total Unique ways by moving right and down are : " + uniquePaths(row, col));
    }

}
