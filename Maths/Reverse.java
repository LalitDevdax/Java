package Maths;

import java.util.Scanner;

public class Reverse {
    public static void reversenum(int n) {

        int num = n;
        int revnum = 0;
        while (num > 0) {
            int lastdig = num % 10;
            num = num / 10;
            revnum = (revnum * 10) + lastdig;
        }
        System.out.println("Reverse of " + n + " is : " + revnum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse it : ");
        int n = sc.nextInt();
        sc.close();
        reversenum(n);
    }
}
