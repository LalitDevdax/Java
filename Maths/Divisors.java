package Maths;

import java.util.Scanner;

public class Divisors {
    public static void divisors(int n) {

        // First :TC = O(n)
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.println(i);
        // }
        // }

        // second :TC = O(sqrt( n))

        for (int i = 1; i * i <= n; i++) { // Iterate up to √n
            if (n % i == 0) { // Check if 'i' is a divisor
                System.out.print(i + " "); // Print the smaller divisor
                if (i != n / i) { // Avoid duplicate if 'i' and 'n / i' are the same
                    System.out.print((n / i) + " "); // Print the paired divisor
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find perfect divisors : ");
        int n = sc.nextInt();
        long start = System.nanoTime(); // Start the timer
        divisors(n); // Call the function
        long end = System.nanoTime(); // End the timer

        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        sc.close();
    }
}
