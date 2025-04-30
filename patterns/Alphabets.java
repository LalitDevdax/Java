import java.util.Scanner;

public class Alphabets {

    public static void newpattern(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    public static void newpattern1(int n) {
        if (n == 0) {
            return;
        }

        for (int i = n; i > 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    public static void newpattern2(int n) {
        if (n == 0) {
            return;
        }

        char toprint = 'A';
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(toprint + " ");

            }
            toprint = (char) (toprint + 1);
            System.out.println();
        }

    }

    public static void newpattern3(int n) {
        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }

            // Printing increasing sequence
            char ch = 'A';
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (ch + k));
            }

            // Printing decreasing sequence
            for (int k = i - 1; k >= 0; k--) {
                System.out.print((char) (ch + k));
            }

            System.out.println();
        }
    }

    public static void newpattern4(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + ((n - 1) - j)) + " ");
            }
            System.out.println();
        }
    }

    public static void newpattern5(int n) {
        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            // Printing decreasing sequence
            for (int l = i; l < n; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < (n - i) * 2; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void newpattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void newpattern7(int n) {
        for (int i = 0; i < (2 * n) - 1; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = sc.nextInt();
        sc.close();

        newpattern(n);
        System.out.println();
        newpattern1(n);
        System.out.println();
        newpattern2(n);
        System.out.println();
        newpattern3(n);
        System.out.println();
        newpattern4(n);
        System.out.println();
        newpattern5(n);
        System.out.println();
        newpattern6(n);
        System.out.println();
        newpattern7(n);
    }
}