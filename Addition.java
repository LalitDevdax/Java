import java.util.Scanner;

public class Addition {

    public static void sum(int a, int b) {
        int addition = a + b;
        System.out.println("The addition of " + a + " + " + b + " is: " + addition);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner hl = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = hl.nextInt();
        System.out.println("Enter second number : ");
        b = hl.nextInt();
        sum(a, b);
        hl.close();
    }
}
