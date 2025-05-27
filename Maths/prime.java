package Maths;

import java.util.Scanner;

public class prime {
    public static void primee(int n) {

        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i != i)) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println("The Number Is Prime");
        } else {
            System.out.println("The Number Is Not Prime");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime or not : ");
        int n = sc.nextInt();
        long start = System.nanoTime(); // Start the timer
        primee(n);// Call the function
        long end = System.nanoTime(); // End the timer

        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        sc.close();
    }
}
