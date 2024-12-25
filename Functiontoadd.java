import java.util.Scanner;
public class Functiontoadd {
    public static void add(int x,int y) {
       int z=x+y;
       System.out.println("The Sum Of "+x+" + "+y+" is : "+z);
       return;
    }

    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First Value : ");
        x=sc.nextInt();
        System.out.print("Enter Second Value : ");
        y=sc.nextInt();
        add(x, y);
        sc.close();
        

    }
}
