package questions;

import java.util.Scanner;

public class q1 {
    public static void avg(int x ,int y ,int z) {
        int a=(x+y+z)/3;
        System.out.println("The avg of given numbers is :  "+a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter No.1 : ");
        x=sc.nextInt();
        System.out.print("Enter No.2 : ");
        y=sc.nextInt();
        System.out.print("Enter No.3 : ");
        z=sc.nextInt();
        sc.close();
        avg(x, y, z);
    }
}
