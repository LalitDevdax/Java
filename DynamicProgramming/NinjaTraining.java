package DynamicProgramming;

import java.util.Arrays;
import java.util.Random;

public class NinjaTraining {
    // Function to calculate maximum points a Ninja can score
    public static int maximumPoints(int arr[][]) {
        int n = arr.length;
        int[] prev = new int[4];

        // Base case for the first day
        prev[0] = Math.max(arr[0][1], arr[0][2]);
        prev[1] = Math.max(arr[0][0], arr[0][2]);
        prev[2] = Math.max(arr[0][0], arr[0][1]);
        prev[3] = Math.max(arr[0][0], Math.max(arr[0][1], arr[0][2]));

        // Iterating over the remaining days
        for (int day = 1; day < n; day++) {
            int[] temp = new int[4];

            for (int last = 0; last < 4; last++) {
                temp[last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        temp[last] = Math.max(temp[last], arr[day][task] + prev[task]);
                    }
                }
            }
            prev = temp;
        }

        return prev[3];
    }

    public static void main(String[] args) {
        int days = 3;
        int tasks = 3;
        int[][] arr = new int[days][tasks];

        Random random = new Random();

        for (int i = 0; i < days; i++) {
            for (int j = 0; j < tasks; j++) {
                arr[i][j] = random.nextInt(10) + 1; // Generates numbers from 1 to 10
            }
        }

        System.out.println("Generated points array:");
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < tasks; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The Maximum Points A Ninja Scored Is: " + maximumPoints(arr));
    }
}