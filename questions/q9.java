package questions;

import java.util.Scanner;

public class q9 {
    // private static Scanner sc;
    public static void main(String[] args) {
        int a, b, gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        b = sc.nextInt();
        sc.close();
        gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " =  " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}