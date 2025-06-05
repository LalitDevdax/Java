package DynamicProgramming;

import java.util.Arrays;
import java.util.Random;

public class UniquePaths2 {

    public static int uniquePaths(int m, int n, int[][] arr) {
        int[] prev = new int[n];
        prev[0] = (arr[0][0] == -1) ? 0 : 1;

        for (int i = 0; i < m; i++) {
            int[] curr = new int[n];
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == -1)
                    curr[j] = 0;
                else {
                    curr[j] = prev[j] + (j > 0 ? curr[j - 1] : 0);
                }

            }
            prev = curr;
        }
        return prev[n - 1];
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];

        Random random = new Random();

        // Step 1: Fill the entire array with zeros
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = 0;
            }
        }

        // Step 2: Place 1 or 2 `-1`s randomly
        int numNegatives = random.nextInt(1) + 1; // Randomly decide to place 1 or 2 `-1`s
        for (int k = 0; k < numNegatives; k++) {
            int i = random.nextInt(row); // Random row index
            int j = random.nextInt(col); // Random column index
            arr[i][j] = -1; // Set to `-1`
        }

        // Print the array
        System.out.println("Generated array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(
                "Total Unique ways by moving right and down with obstacles are : " + uniquePaths(row, col, arr));
    }
}
