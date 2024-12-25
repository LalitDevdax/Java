import java.util.Scanner;

public class Factorial {

    public static void facto(int x) {
        int factorial=1;
        if (x==0) {
            System.out.print("Enter number greater than 0 !!");
        }
        for(int i=x;i>=1;i--){
            factorial *=i;
        }

        System.out.print("The Factorial of given number is : "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter number to find factorial of : ");
        x=sc.nextInt();
        sc.close();
        facto(x);
    }
}
