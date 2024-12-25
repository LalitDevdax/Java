package questions;

import java.util.Scanner;

public class q3 {
    public static void greater(int x ,int y ) {
        if (x>y) {
            System.out.print("The Greater of given numbers is No.1 :  "+x);
        }
        else if(x==y){
            System.out.print("Both given numbers are equal !!");
        }else{
            System.out.print("The Greater of given numbers is No.2 :  "+y);
        }   
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Enter No.1 : ");
        x=sc.nextInt();
        System.out.print("Enter No.2 : ");
        y=sc.nextInt();
        sc.close();
        greater(x, y);
    }
}
