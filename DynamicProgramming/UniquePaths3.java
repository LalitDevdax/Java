package DynamicProgramming;

import java.util.Random;

public class UniquePaths3 {

    public static int uniquePathsIII(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int startX = 0, startY = 0;
        int totalZeros = 0;

        // Step 1: Find start position (`1`) & count `0`s
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 0) {
                    totalZeros++;
                }
            }
        }

        // Step 2: Start recursion
        return countPaths(grid, startX, startY, 0, totalZeros);
    }

    private static int countPaths(int[][] grid, int x, int y, int count, int totalZeros) {
        // Base Case: Out of bounds OR hit obstacle OR revisited cell
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) {
            return 0;
        }

        // If we reach the destination (`2`)
        if (grid[x][y] == 2) {
            return count == totalZeros ? 1 : 0; // Make sure all `0`s were visited
        }

        // Mark cell as visited (`-1`)
        int temp = grid[x][y];
        grid[x][y] = -1;

        // Explore all 4 directions
        int paths = countPaths(grid, x + 1, y, count + (temp == 0 ? 1 : 0), totalZeros)
                + countPaths(grid, x - 1, y, count + (temp == 0 ? 1 : 0), totalZeros)
                + countPaths(grid, x, y + 1, count + (temp == 0 ? 1 : 0), totalZeros)
                + countPaths(grid, x, y - 1, count + (temp == 0 ? 1 : 0), totalZeros);

        // Backtrack to allow other paths
        grid[x][y] = temp;

        return paths;
    }

    // 🔹 Generating a random grid
    public static int[][] generateRandomGrid(int rows, int cols) {
        Random random = new Random();
        int[][] grid = new int[rows][cols];

        // Fill the grid with zeros initially
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = 0;
            }
        }

        // Place `1` (Start) at a random position
        int startX = random.nextInt(rows);
        int startY = random.nextInt(cols);
        grid[startX][startY] = 1;

        // Place `2` (End) at a different random position
        int endX, endY;
        do {
            endX = random.nextInt(rows);
            endY = random.nextInt(cols);
        } while (endX == startX && endY == startY); // Ensure it's a different position
        grid[endX][endY] = 2;

        // Place some `-1` (Obstacles) randomly
        int numObstacles = random.nextInt(rows * cols / 4); // Limit obstacles to keep paths open
        for (int k = 0; k < numObstacles; k++) {
            int obsX, obsY;
            do {
                obsX = random.nextInt(rows);
                obsY = random.nextInt(cols);
            } while (grid[obsX][obsY] != 0); // Ensure obstacles don't overwrite `1` or `2`
            grid[obsX][obsY] = -1;
        }

        return grid;
    }

    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] grid = generateRandomGrid(rows, cols);

        System.out.println("Generated Random Grid:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total unique paths from start (1) to end (2): " + uniquePathsIII(grid));
    }
}
