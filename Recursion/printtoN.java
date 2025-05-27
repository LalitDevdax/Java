package Recursion;

import java.util.Scanner;

public class printtoN {
    public static void recursionprint(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        recursionprint(n, count + 1);
    }

    public static void rev_recursionprint(int n, int count) {
        if (count == 0) {
            return;
        }
        System.out.println(count);
        rev_recursionprint(n, count - 1);
    }

    public static void back_recursionprint(int n, int count) {
        if (n < count) {
            return;
        }

        back_recursionprint(n, count + 1);
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print upto : ");
        int n = sc.nextInt();
        long start = System.nanoTime(); // Start the timer
        recursionprint(n, 1);
        System.out.println();
        rev_recursionprint(n, n);
        System.out.println();
        back_recursionprint(n, 1);
        long end = System.nanoTime(); // End the timer

        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        sc.close();

    }
}
