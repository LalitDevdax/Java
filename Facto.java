import java.util.Scanner;

public class Facto {
    public static void factorialcall(int num) {
        int facto = 1;
        if (num == 0) {
            System.out.println("Enter a number greater than 0 !");
        }

        for (int i = num; i > 0; i--) {
            facto *= i;
        }
        System.out.println("The Factorial of given number is : " + facto);

    }

    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        int num;
        System.out.println("Enter the number greater than 0 : ");
        num = hl.nextInt();
        factorialcall(num);

        hl.close();
    }
}
