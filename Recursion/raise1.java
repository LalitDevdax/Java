package Recursion;
import java.util.*;
public class raise1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //same program but stack height must be log n

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

        
        //for n=even
        if(n%2==0){
            return raisefunc(x, n/2) * raisefunc(x, n/2);
        }
        else{
            return raisefunc(x, n/2) * raisefunc(x, n/2) * x;
        }

    }
}
