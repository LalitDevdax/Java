import java.util.Scanner;

public class Unique {

    public static void newpattern(int n) {
        if (n == 0) {
            return;
        }

        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }

    }

    public static void newpattern1(int n) {
        if (n == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            for (int k = 0; k < (n - i) * 2; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print(i - l);
            }
            System.out.println();
        }

    }

    public static void newpattern2(int n) {
        if (n == 0) {
            return;
        }
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                start++;
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
        newpattern1(n);
        newpattern2(n);
    }
}
