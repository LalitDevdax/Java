package questions;

import java.util.Scanner;

public class q2 {
    public static void oddsum(int x) {
        int oddno=0;
        for(int i=0;i<=x;i++){
            if (i%2!=0) {
                oddno +=i;
            }
        }
        System.out.println("The sum of odd numbers upto given range is : "+oddno);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.print("Enter No.1 : ");
        x=sc.nextInt();
        sc.close();
        oddsum(x);
        
    }
}
