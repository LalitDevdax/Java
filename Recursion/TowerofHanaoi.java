package Recursion;
import java.util.*;
public class TowerofHanaoi {

    public static void towerofhanoi(int n ,String src,String helper,String dest) {
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        towerofhanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerofhanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("ENter Value of total disk in tower : ");
        int n=sc.nextInt();
        sc.close();
        towerofhanoi(n, "Source", "Helper", "Destination");

    }
}
