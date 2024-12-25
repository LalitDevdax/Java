package Recursion;
import java.util.*;
public class raise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Base : ");
        int x=sc.nextInt();
        System.out.print("Enter Exponential : ");
        int n=sc.nextInt();
        sc.close();
        int ans=raisefunc(x,n);
        System.out.print("Value is : "+ans);

    }

    public static int raisefunc(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xpownm1=raisefunc(x, n-1);
        int xpown=x*xpownm1;
        return xpown;
    }
}
