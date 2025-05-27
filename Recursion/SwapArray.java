package Recursion;

import java.util.Scanner;

public class SwapArray {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void swaparray(int n, int[] arr, int i) {
        if (i >= n / 2) {
            return;
        }
        swap(arr, i, n - i - 1);
        swaparray(n, arr, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " Element : ");
            arr[i] = sc.nextInt();
        }
        long start = System.nanoTime(); // Start the timer
        swaparray(n, arr, 0);
        long end = System.nanoTime(); // End the timer
        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        System.out.println("Swapped Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
