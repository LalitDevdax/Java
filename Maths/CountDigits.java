package Maths;

import java.util.Scanner;

public class CountDigits {

    public static void countdigits(int n) {
        int num = n;
        // int count = 0;

        // while (num > 0) {
        // count++;
        // num /= 10;
        // }
        // System.out.println("Total Digits in Number " + n + " is : " + count);

        // OR ONE MORE WAY -

        int count = (int) (Math.log10(num) + 1);
        System.out.println("Total Digits in Number " + n + " is : " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count total digits in it : ");
        int n = sc.nextInt();
        sc.close();
        countdigits(n);
    }
}
