package Maths;

import java.util.Scanner;

public class Palindrome {
    public static void reversenum(int n) {

        int num = n;
        // int revnum = 0;
        // while (num > 0) {
        // int lastdig = num % 10;
        // num = num / 10;
        // revnum = (revnum * 10) + lastdig;
        // }
        // if (n == revnum) {
        // System.out.println("The Number " + n + " is Palindrome");
        // } else {
        // System.out.println("The Number " + n + " is Not Palindrome");
        // }

        // Better Approach

        if (num < 0 || (num % 10 == 0 && num != 0)) {
            System.out.println("Not Palindrome");
        }

        int reversedhalf = 0;
        while (num > reversedhalf) {
            int lastDigit = num % 10;
            reversedhalf = (reversedhalf * 10) + lastDigit;
            num /= 10;
        }
        if (num == reversedhalf || num == reversedhalf / 10) {
            System.out.println("Palnidrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Palindrome : ");
        int n = sc.nextInt();
        sc.close();
        reversenum(n);
    }
}
