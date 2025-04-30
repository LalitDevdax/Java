import java.util.Scanner;

public class Pyramid {

    public static void pyramid(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void revpyramid(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void full(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = sc.nextInt();
        sc.close();

        pyramid(n);
        System.out.println();
        revpyramid(n);
        System.out.println();
        full(n);
    }

}
