package Recursion;

import java.util.Scanner;

public class StringPalindrome {
    static boolean palindrome(String n, int i) {
        if (i >= n.length() / 2) {
            return true;
        }
        if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
            return false;
        }

        return palindrome(n, i + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String To Check If It's Palindrome Or Not : ");
        String s = sc.nextLine();

        long start = System.nanoTime(); // Start the timer
        System.out.println(palindrome(s, 0));
        long end = System.nanoTime(); // End the timer
        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");

        sc.close();

    }
}
