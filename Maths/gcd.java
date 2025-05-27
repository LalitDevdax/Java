package Maths;

import java.util.Scanner;

public class gcd {
    public static void gcdorhcf(int n1, int n2) {

        // we use euclidean algo to find gcd(a,b) = (a-b,b) ; and if suppose (2,5) 2 is
        // smaller so now b-a , a till one become 0 ,
        // and other is gcd , its taking more time instead use (a%b,b) and (b%a,a)

        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        System.out.println("The GCD IS: " + (n1 == 0 ? n2 : n1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        long start = System.nanoTime(); // Start the timer
        gcdorhcf(n1, n2);// Call the function
        long end = System.nanoTime(); // End the timer

        System.out.println("Time taken: " + (end - start) / 1000000.0 + " ms");
        sc.close();
    }
}
