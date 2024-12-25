package questions;

import java.util.Scanner;

public class q8 {

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }

    public static void main(String[] args) {
        // Take input from the user
        // Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        // int t1 = 0, t2 = 1;
        System.out.print("Enter the number to find fibonacci series: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
        // System.out.println("Fibonnaci series upto "+n+": ");
        // //Print the fibonacci series
        // while (t1 <= n)
        // {
        // System.out.print(t1 + " ");
        // int sum = t1 + t2;
        // t1 = t2;
        // t2 = sum;
        // }
    }
}