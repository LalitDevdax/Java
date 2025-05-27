package Maths;

import java.util.Scanner;

public class Armstrong {
    public static void armstrong(int n) {
        // optional we can remove this and just assume valid +ve number as input .
        if (n <= 0) {
            System.out.println("Not Armstrong");
            return; // Exit the method early
        }

        int c = 0;
        int x = n;
        int[] cubes = { 0, 1, 8, 27, 64, 125, 216, 343, 512, 729 }; // Cubes of 0-9

        while (x > 0) {
            int lastdig = x % 10;
            c += cubes[lastdig];
            x /= 10;
        }

        if (c == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong : ");
        int n = sc.nextInt();
        long start = System.nanoTime(); // Start the timer
        armstrong(n); // Call the function
        long end = System.nanoTime(); // End the timer

        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        sc.close();
        armstrong(n);
    }
}
