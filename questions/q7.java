package questions;

import java.util.Scanner;

public class q7 {
    public static void expo(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("The Answer is : " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n;
        System.out.print("Enter Number : ");
        x = sc.nextInt();
        System.out.print("Enter its power : ");
        n = sc.nextInt();
        sc.close();
        expo(x, n);

    }
}