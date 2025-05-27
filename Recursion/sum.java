package Recursion;

import java.util.Scanner;

public class sum {
    public static void sumton_recursionprint(int n, int sum) {

        if (n < 1) {
            System.out.println(sum);
            return;
        }

        sumton_recursionprint(n - 1, sum + n);
    }

    public static int sumton_recursionprint1(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumton_recursionprint1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to sum upto : ");
        int n = sc.nextInt();
        long start = System.nanoTime(); // Start the timer
        sumton_recursionprint(n, 0);
        System.out.println(sumton_recursionprint1(n));

        long end = System.nanoTime(); // End the timer
        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        sc.close();

    }
}
