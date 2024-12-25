package BitManipulation;
import java.util.*;
public class bitupdate {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a operator i.e 1 or 0 : ");
        int op=sc.nextInt();
        sc.close();

        int pos=1;
        int n=5;
        if(op==1){
            int bitmask=1<<pos;
            int newnum=bitmask | n;
            System.out.println(newnum);
        }else if(op==0){
            int bitmask=1<<pos;
            int newnum= ~(bitmask) & n;
            System.out.println(newnum);
        }else{
            System.out.println("Enter 1 or 0 !!");
        }
        
    }
}
