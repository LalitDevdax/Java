package questions;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();

        if (number > 0) {
            positive++;
        } else if (number < 0) {
            negative++;
        } else {
            zeros++;
        }

        sc.close();
        System.out.println("Positives : " + positive);
        System.out.println("Negatives : " + negative);
        System.out.println("Zeros : " + zeros);
    }
}
