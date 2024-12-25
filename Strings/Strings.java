package Strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String name=sc.nextLine();
        System.out.println("Your Full Name is : "+name);
        sc.close();
    }
}
