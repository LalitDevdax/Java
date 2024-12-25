package questions;

import java.util.Scanner;

public class q4 {
    public static void circum(int x) {
        
        double circumfrance=(2*3.14159265359)*x;
        System.out.println("The Circumfrance of given radius of circls is : "+circumfrance);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter Radius of circle : ");
        x=sc.nextInt();
        sc.close();
        circum(x);
        
    }
}